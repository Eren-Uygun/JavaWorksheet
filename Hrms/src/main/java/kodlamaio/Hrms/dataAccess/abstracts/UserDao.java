package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entity.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
