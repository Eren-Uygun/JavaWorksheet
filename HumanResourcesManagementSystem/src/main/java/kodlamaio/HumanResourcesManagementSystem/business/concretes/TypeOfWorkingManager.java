package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.TypeOfWorkingService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.TypeOfWorkingDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.TypeOfWorking;

@Service
public class TypeOfWorkingManager implements TypeOfWorkingService {

	private TypeOfWorkingDao _typeOfWorkingDao;
	
	@Autowired
	public TypeOfWorkingManager(TypeOfWorkingDao _typeOfWorkingDao) {
		super();
		this._typeOfWorkingDao = _typeOfWorkingDao;
	}

	@Override
	public Result add(TypeOfWorking typeOfWorking) {
		return new SuccessDataResult<TypeOfWorking>(_typeOfWorkingDao.save(typeOfWorking), "Çalışma tipi eklendi.");
	}

	@Override
	public DataResult<List<TypeOfWorking>> getAll() {
		return new SuccessDataResult<List<TypeOfWorking>>(_typeOfWorkingDao.findAll(), "Çalışma tipileri listelendi.");
	}

}
