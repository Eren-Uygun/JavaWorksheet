package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.abstracts.Activation;

public interface ActivationDao extends JpaRepository<Activation, Integer> {

}
