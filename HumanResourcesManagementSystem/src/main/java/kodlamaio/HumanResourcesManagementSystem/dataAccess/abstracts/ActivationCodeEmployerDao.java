package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.ActivationCodeEmployer;

public interface ActivationCodeEmployerDao extends JpaRepository<ActivationCodeEmployer, Integer> {

}
