package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.ActivationService;
import kodlamaio.Hrms.business.abstracts.EmployerService;
import kodlamaio.Hrms.core.utilities.abstracts.CredentialCheckService;
import kodlamaio.Hrms.core.utilities.abstracts.MernisVerificiationService;
import kodlamaio.Hrms.core.utilities.abstracts.PasswordCheckService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.entity.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao _employerDao;


	@Autowired
	public EmployerManager(EmployerDao _employerDao) {
		super();
		this._employerDao = _employerDao;
		
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(_employerDao.findAll(),"İş verenler listelendi.");
	}


}
