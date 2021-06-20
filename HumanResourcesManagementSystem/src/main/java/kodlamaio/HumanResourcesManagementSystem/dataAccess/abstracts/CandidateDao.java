package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer> {
	
	Candidate getByNationalIdentityNumber(String nationalIdentityNumber);
	

	@Query("Select  c from Candidate c Where c.email=?1")
	Optional<Candidate>findByEmail(String email);
	
	@Query("Select  c from Candidate c Where c.nationalIdentityNumber=?1")
	Optional<Candidate>findByNationalIdentityNumber(String nationalIdentityNumber);
	
}
