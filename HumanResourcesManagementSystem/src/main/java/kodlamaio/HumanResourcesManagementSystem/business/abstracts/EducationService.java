package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Education;

public interface EducationService {
	
	Result add(Education Education);
	DataResult<List<Education>> getAll();
	DataResult<List<Education>> getByDateOfGraduationSorted(int candidateId);

}
