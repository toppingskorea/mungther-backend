package planet.mungther.global.error;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.validation.BindingResult;

import lombok.Getter;

@Getter
public class ErrorResponse {

	private final String message;
	private final int status;
	private final List<FieldError> errors;
	private final String code;
	private final LocalDateTime timestamp;

	private ErrorResponse(
		String message,
		int status,
		String code
	) {
		this.message = message;
		this.status = status;
		this.errors = new ArrayList<>();
		this.code = code;
		this.timestamp = LocalDateTime.now();
	}

	private ErrorResponse(
		ErrorCode code,
		List<FieldError> fieldErrors
	) {
		this.message = code.getMessage();
		this.status = code.getStatus();
		this.errors = fieldErrors;
		this.code = code.getCode();
		this.timestamp = LocalDateTime.now();
	}

	public static ErrorResponse of(ErrorCode code) {
		return new ErrorResponse(code.getMessage(), code.getStatus(), code.getCode());
	}

	public static ErrorResponse of(ErrorCode code, BindingResult e) {
		return new ErrorResponse(code, FieldError.of(e));
	}

	@Getter
	public static class FieldError {

		private final String field;
		private final String value;
		private final String reason;

		private FieldError(
			String field,
			String value,
			String reason
		) {
			this.field = field;
			this.value = value;
			this.reason = reason;
		}

		public static List<FieldError> of(BindingResult bindingResult) {
			return bindingResult.getFieldErrors()
				.stream()
				.map(error -> new FieldError(
					error.getField(),
					error.getRejectedValue() == null ? "" : error.getDefaultMessage(),
					error.getCode()
				)).collect(Collectors.toList());
		}
	}
}

