package planet.mungther.global.error;

import static planet.mungther.global.error.ErrorCode.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

	/**
	 * 모든 예외를 잡을 수 있는 핸들러
	 */
	@ExceptionHandler(Exception.class)
	protected ResponseEntity<ErrorResponse> handleException(Exception e) {
		log.error("handleException", e);
		final ErrorResponse errorResponse = ErrorResponse.of(INTERNAL_SERVER_ERROR);
		return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(INTERNAL_SERVER_ERROR.getStatus()));
	}

	/**
	 * 비즈니스 요구사항에 맞지 않는 경우 발생하는 예외 핸들러
	 */
	@ExceptionHandler(BusinessException.class)
	protected ResponseEntity<ErrorResponse> handleBusinessException(BusinessException e) {
		log.error("handleBusinessException", e);
		final ErrorCode errorCode = e.getErrorCode();
		final ErrorResponse errorResponse = ErrorResponse.of(errorCode);
		return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(errorCode.getStatus()));
	}

	/**
	 * Validation 핸들러
	 */
	@ExceptionHandler(MethodArgumentNotValidException.class)
	protected ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		log.error("handleMethodArgumentNotValidException", e);
		final ErrorResponse errorResponse = ErrorResponse.of(INVALID_INPUT_VALUE, e.getBindingResult());
		return new ResponseEntity<>(errorResponse, HttpStatus.valueOf(errorResponse.getStatus()));
	}
}
