package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployerService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployerDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao _employerDao;

	@Autowired
	public EmployerManager(EmployerDao _employerDao) {
		super();
		this._employerDao = _employerDao;
	}

	@Override
	public Result add(Employer employer) {
		return new SuccessDataResult<Employer>(_employerDao.save(employer), "İş veren kaydedildi.");
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(_employerDao.findAll(), "İş veren listesi getirildi..");
	}

	@Override
	public DataResult<Employer> getById(int id) {
		return new SuccessDataResult<Employer>(_employerDao.getById(id));
	}

}
