package kodlamaIo.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaIo.Hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
