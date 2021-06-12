package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Job;

public interface JobService {
	
	Result add(Job job);
	DataResult<List<Job>> getAll();
	DataResult<Job> getById(int id);

}
