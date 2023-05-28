package planet.mungther.user.api;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import planet.mungther.global.dto.request.UserPreOrderRequest;
import planet.mungther.global.dto.response.PreOrderCount;
import planet.mungther.global.dto.response.Success;
import planet.mungther.user.Service.UserPreOrderService;
import planet.mungther.user.domain.User;
import planet.mungther.user.repository.UserJpaRepository;

@RestController
@RequiredArgsConstructor
public class UserController {

	private final UserPreOrderService preOrderService;
	private final UserJpaRepository userJpaRepository;

	@GetMapping("/")
	public ResponseEntity<PreOrderCount> countPreOrders(
	) {
		List<User> userList = userJpaRepository.findAll();
		PreOrderCount success = new PreOrderCount();
		success.updateUserCount(userList.size());
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
			.created(URI.create("/new" + userId))
			.body(new Success());
	}
}
