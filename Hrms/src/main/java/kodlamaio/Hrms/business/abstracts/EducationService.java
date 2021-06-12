package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.entity.concretes.Education;

public interface EducationService {
	
	    DataResult<Education> add(Education education);
	    DataResult<List<Education>> SortedEducation(int candidateId);
		DataResult<List<Education>> getAll();
		DataResult<Education> getById(int id);
		DataResult<List<Education>> getAllByJobseekerIdOrderByEndedDateDesc(int id);
		DataResult<List<Education>> getAllByJobSeekerId(int id);

}
