package springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
