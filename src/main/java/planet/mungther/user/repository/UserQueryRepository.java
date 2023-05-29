package planet.mungther.user.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public interface UserQueryRepository extends UserJpaRepository{
	boolean existsByEmail(String email);

	@Query("SELECT u.dogName FROM User u WHERE u.dogName IS NOT NULL")
	List<String> findDogNamesNotNull();
}

