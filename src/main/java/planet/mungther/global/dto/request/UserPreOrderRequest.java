package planet.mungther.global.dto.request;

import static lombok.AccessLevel.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
public class UserPreOrderRequest {
	private String email;
	private String agreement;
}
