package springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
