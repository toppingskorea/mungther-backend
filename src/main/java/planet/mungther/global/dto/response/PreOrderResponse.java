package planet.mungther.global.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PreOrderResponse {
	private int userCount;
	private List<String> dogNameList;
}

