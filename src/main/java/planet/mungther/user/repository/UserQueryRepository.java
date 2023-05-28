package planet.mungther.user.repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserQueryRepository extends UserJpaRepository{
	boolean existsByEmail(String email);
}

