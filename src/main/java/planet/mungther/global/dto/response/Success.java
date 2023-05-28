package planet.mungther.global.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Success {
	private final boolean isSuccess;

	public Success() {
		this.isSuccess = true;
	}
}

