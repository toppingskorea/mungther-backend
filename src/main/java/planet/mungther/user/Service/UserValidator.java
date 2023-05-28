package planet.mungther.user.Service;

import static planet.mungther.global.error.ErrorCode.*;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import planet.mungther.global.error.BusinessException;
import planet.mungther.user.repository.UserQueryRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserValidator {

	private final UserQueryRepository userQueryRepository;

	public void validateEmailIsNotDuplicated(String email) {
		if (userQueryRepository.existsByEmail(email)) {
			throw new BusinessException(USER_DUPLICATED_EMAIL);
		}
	}
}
