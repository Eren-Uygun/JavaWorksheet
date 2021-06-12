package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.abstracts.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findByEmail(String emailAddress);
}
