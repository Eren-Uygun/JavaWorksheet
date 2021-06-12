package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Education;


public interface EducationDao extends JpaRepository<Education, Integer> {
	
	Result add (Education education);	
	Education getById(int id);
	DataResult<List<Education>> getAll();
	List<Education> getAllByCandidate_idOrderByEndedDateDesc(int id);
	List<Education> getAllByCandidate_id(int id);

}
