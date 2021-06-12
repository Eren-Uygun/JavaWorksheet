package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.TypeOfWorking;

public interface TypeOfWorkingService {
	
	Result add(TypeOfWorking typeOfWorking);

	DataResult<List<TypeOfWorking>> getAll();

}
