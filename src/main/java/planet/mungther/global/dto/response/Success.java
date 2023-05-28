package planet.mungther.global.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Success {
	private final boolean isSuccess;
	private int userListSize;

	public Success() {
		this.isSuccess = true;
	}
}

