package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.entity.concretes.Education;
import kodlamaio.Hrms.entity.dto.SortedEducationWithCandidateDto;

public interface EducationService {
	
	    DataResult<Education> add(Education education, int candidateId);
	/*    
	    DataResult<List<SortedEducationWithCandidateDto>> sortedEducationWithCandidate(int candidateId);
	 */   
	    DataResult<List<Education>> SortedEducation(int candidateId);

}
