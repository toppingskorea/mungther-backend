package planet.mungther.user.api.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import planet.mungther.global.dto.request.UserPreOrderRequest;
import planet.mungther.global.dto.response.PreOrderResponse;
import planet.mungther.global.dto.response.Success;
import planet.mungther.user.Service.UserPreOrderService;
import planet.mungther.user.domain.user.User;
import planet.mungther.user.repository.UserJpaRepository;
import planet.mungther.user.repository.UserQueryRepository;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserPreOrderService preOrderService;
    private final UserJpaRepository userJpaRepository;
    private final UserQueryRepository userQueryRepository;

    @GetMapping("/")
    public ResponseEntity<PreOrderResponse> countPreOrders(
    ) {
        PreOrderResponse success = new PreOrderResponse(
                userQueryRepository.findAll().size(),
                userQueryRepository.findDogNamesNotNull());
        return ResponseEntity
                .ok()
                .body(success);
    }

    @PostMapping("/new")
    public ResponseEntity<Success> createPreOrder(
            @RequestBody
            UserPreOrderRequest request
    ) {
        preOrderService.createPreOrder(request);
        return ResponseEntity
                .ok()
                .body(new Success());
    }

    @PostMapping("/count")
    public ResponseEntity<Success> createPreOrderNonEmail(
    ) {
        userJpaRepository.save(new User(null, "N", null));
        return ResponseEntity
                .ok()
                .body(new Success());
    }
}
