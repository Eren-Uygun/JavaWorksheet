package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Experience;

public interface ExperienceService {
	
	Result add(Experience cvExperience);
	DataResult<List<Experience>> getAll();
	DataResult<List<Experience>> getByDateOfFinishSorted(int candidateId);

}
