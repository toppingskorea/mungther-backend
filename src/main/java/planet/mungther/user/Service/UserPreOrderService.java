package planet.mungther.user.Service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import planet.mungther.global.dto.request.UserPreOrderRequest;
import planet.mungther.user.domain.user.User;
import planet.mungther.user.repository.UserJpaRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class UserPreOrderService {

	private final UserValidator userValidator;
	private final UserJpaRepository userJpaRepository;

	public void createPreOrder(UserPreOrderRequest request) {
		User user = User.of(request.getEmail(), request.getAgreement(), request.getDogName());
		userValidator.validateEmailIsNotDuplicated(user.getEmail());
		userJpaRepository.save(user);
	}
}
