package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.entity.concretes.JobExperience;

public interface JobExperienceService {
	
	    DataResult<JobExperience> add(JobExperience jobExperiences, int candidateId);
	    DataResult<List<JobExperience>> SortedJobExperiences(int candidateId);
		DataResult<List<JobExperience>> getAll();
		DataResult<JobExperience> getById(int id);
		DataResult<List<JobExperience>> getAllByJobSeekerId(int jobSeekerId);
		DataResult<List<JobExperience>>  getAllByJobSeekerIdOrderByDesc(int id);

}
