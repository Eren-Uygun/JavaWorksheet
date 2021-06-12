package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Experience;

public interface ExperienceDao extends JpaRepository<Experience, Integer> {
	
	List<Experience> getByCurriculumVitae_Candidate_id(int id);

	List<Experience> getByCurriculumVitae_Candidate_id(int id, Sort sort);

}
