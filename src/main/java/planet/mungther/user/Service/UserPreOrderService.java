package planet.mungther.user.Service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import planet.mungther.global.dto.request.UserPreOrderRequest;
import planet.mungther.user.domain.User;
import planet.mungther.user.repository.UserJpaRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class UserPreOrderService {

	private final UserJpaRepository userJpaRepository;

	public Long createPreOrder(UserPreOrderRequest request) {
		User user = User.of(request.getEmail(), request.getAgreement());
		User savedUser = userJpaRepository.save(user);
		return savedUser.getId();
	}
}
