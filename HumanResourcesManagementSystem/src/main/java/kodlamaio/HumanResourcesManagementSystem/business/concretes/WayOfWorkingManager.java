package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.WayOfWorkingService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.WayOfWorkingDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.TypeOfWorking;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.WayOfWorking;

@Service
public class WayOfWorkingManager implements WayOfWorkingService {

	private WayOfWorkingDao _wayOfWorkingDao;
	
	@Autowired
	public WayOfWorkingManager(WayOfWorkingDao _wayOfWorkingDao) {
		super();
		this._wayOfWorkingDao = _wayOfWorkingDao;
	}

	@Override
	public Result add(WayOfWorking wayOfWorking) {
		return new SuccessDataResult<WayOfWorking>(_wayOfWorkingDao.save(wayOfWorking), "Çalışma tarzı eklendi.");
	}

	@Override
	public DataResult<List<WayOfWorking>> getAll() {
		return new SuccessDataResult<List<WayOfWorking>>(_wayOfWorkingDao.findAll(), "Çalışma tarzları listelendi.");
	}

}
