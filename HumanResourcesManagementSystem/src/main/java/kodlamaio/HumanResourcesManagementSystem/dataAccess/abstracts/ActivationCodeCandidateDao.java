package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.ActivationCodeCandidate;

public interface ActivationCodeCandidateDao extends JpaRepository<ActivationCodeCandidate, Integer> {

}
