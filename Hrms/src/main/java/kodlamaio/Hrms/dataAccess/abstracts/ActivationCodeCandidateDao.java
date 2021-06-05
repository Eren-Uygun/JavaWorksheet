package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.Hrms.entity.concretes.ActivationCodeCandidate;

@Repository
public interface ActivationCodeCandidateDao extends JpaRepository<ActivationCodeCandidate, Integer> {

}
