package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.entity.concretes.JobExperience;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {
	
	JobExperience getById(int id);
	DataResult<List<JobExperience>> getAll();
	List<JobExperience> getAllByCandidate_idOrderByEndedDateDesc(int id);
	List<JobExperience> getAllByCandidate_id(int id);

}
