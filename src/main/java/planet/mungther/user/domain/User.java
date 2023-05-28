package planet.mungther.user.domain;

import static javax.persistence.GenerationType.*;
import static lombok.AccessLevel.*;
import static planet.mungther.global.error.ErrorCode.*;

import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import planet.mungther.global.error.BusinessException;

@Entity
@Getter
@DynamicUpdate
@DynamicInsert
@Table(name = "t_user")
@NoArgsConstructor(access = PROTECTED)
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_id")
	private Long id;

	@Column(name = "user_email", columnDefinition = "varchar(100)")
	private String email;

	@Column(name = "user_agreement", columnDefinition = "varchar(1)")
	private String agreement;

	//==생성 Method==//
	@Builder
	public User(
		final String email,
		final String agreement
	) {
		validateEmail(email);
		this.email = email;
		this.agreement = agreement;
	}

	//==정적 팩토리 메소드==//
	public static User of(
		final String email,
		final String agreement
	) {
		return User.builder()
			.email(email)
			.agreement(agreement)
			.build();
	}

	private void validateEmail(final String email) {
		if (isNotValidEmailPattern(email))
			throw new BusinessException(USER_INVALID_EMAIL);
	}

	private static final String EMAIL_PATTERN = "^[_a-z0-9-]+(.[_a-z0-9-]+)*@(?:\\w+\\.)+\\w+$";
	private static final Pattern EMAIL_MATCHER = Pattern.compile(EMAIL_PATTERN);

	private static boolean isNotValidEmailPattern(String email) {
		return !EMAIL_MATCHER.matcher(email).matches();
	}
}
