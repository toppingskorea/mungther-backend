package planet.mungther.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import planet.mungther.user.domain.user.User;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
