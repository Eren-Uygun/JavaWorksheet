package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.WayOfWorking;

public interface WayOfWorkingService {
	
	Result add(WayOfWorking wayOfWorking);

	DataResult<List<WayOfWorking>> getAll();

}
