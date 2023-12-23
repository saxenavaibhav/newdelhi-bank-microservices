package saxena.vaibhav.accounts.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import saxena.vaibhav.accounts.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
