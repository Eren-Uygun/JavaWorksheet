package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {
	
	List<Education> getByCurriculumVitae_Candidate_id(int id);
	List<Education> getByCurriculumVitae_Candidate_id(int id, Sort sort);

}
