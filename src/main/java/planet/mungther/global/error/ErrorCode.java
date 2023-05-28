package planet.mungther.global.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

	// Common
	INVALID_INPUT_VALUE("C001", "Invalid Input Value", 400),
	INTERNAL_SERVER_ERROR("C002", "Server Error", 500),
	METHOD_NOT_ALLOWED("C003", "지원하지 않은 HTTP Method 입니다.", 405),
	NOT_EXIST_KEY("C004", "존재하지 않는 키 입니다", 404),

	// User
	USER_INVALID_NICKNAME("U001", "닉네임 형식이 맞지 않습니다.", 400),
	USER_DUPLICATED_NICKNAME("U002", "이미 존재하는 닉네임 입니다.", 409),
	USER_INVALID_EMAIL("U003", "이메일 형식이 맞지 않습니다.", 400),
	USER_DUPLICATED_EMAIL("U004", "이미 가입된 이메일 입니다.", 409),

	;
	private final String code;
	private final String message;
	private final int status;
}
