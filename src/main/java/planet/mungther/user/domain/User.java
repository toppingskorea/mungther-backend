package planet.mungther.user.domain;

import static javax.persistence.GenerationType.*;
import static lombok.AccessLevel.*;

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
}
