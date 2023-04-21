package springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import springboot.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
