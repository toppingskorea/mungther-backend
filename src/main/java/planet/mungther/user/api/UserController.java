package planet.mungther.user.api;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import planet.mungther.global.dto.request.UserPreOrderRequest;
import planet.mungther.global.dto.response.Success;
import planet.mungther.user.Service.UserPreOrderService;
import planet.mungther.user.domain.User;
import planet.mungther.user.repository.UserJpaRepository;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserPreOrderService preOrderService;
	private final UserJpaRepository userJpaRepository;

	@PostMapping("/api")
	public ResponseEntity<Success> countPreOrders(
	) {
		List<User> userList = userJpaRepository.findAll();
		Success success = new Success();
		success.setUserListSize(userList.size());
		return ResponseEntity
		.ok()
		.body(success);
	}

	@PostMapping("/new")
	public ResponseEntity<Success> createPreOrder(
		@RequestBody
		UserPreOrderRequest request
	) {
		Long userId = preOrderService.createPreOrder(request);
		return ResponseEntity
			.created(URI.create("/api/new" + userId))
			.body(new Success());
	}
}
