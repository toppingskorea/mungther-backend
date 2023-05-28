package planet.mungther.global.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PreOrderCount {
	private int userCount;

	public void updateUserCount(int userCount) {
		this.userCount = userCount;
	}

	public PreOrderCount() {
	}
}

