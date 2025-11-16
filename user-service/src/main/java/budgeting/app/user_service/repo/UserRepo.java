package budgeting.app.user_service.repo;

import budgeting.app.user_service.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo  extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);
    Users findByEmail(String email);
}
