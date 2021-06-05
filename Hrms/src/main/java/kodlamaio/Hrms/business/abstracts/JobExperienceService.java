package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.entity.concretes.JobExperience;
import kodlamaio.Hrms.entity.dto.SortedJobExperienceWithCandidateDto;

public interface JobExperienceService {
	
	    DataResult<JobExperience> add(JobExperience jobExperiences, int candidateId);
	    /*
	    DataResult<List<SortedJobExperienceWithCandidateDto>> SortedJobExperiencesWithCandidate(int candidateId);
	    */
	    DataResult<List<JobExperience>> SortedJobExperiences(int candidateId);

}
