package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployerService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.CredentialValidationService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.NullValidationService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployerDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao _employerDao;
	private CredentialValidationService _credentialCheck;
	private NullValidationService _nullValidation;



	@Autowired
	public EmployerManager(EmployerDao _employerDao, CredentialValidationService _credentialCheck,NullValidationService nullValidationService) {
		super();
		this._employerDao = _employerDao;
		this._credentialCheck = _credentialCheck;
		this._nullValidation = nullValidationService;
	}

	@Override
	public Result add(Employer employer) {
		if (_credentialCheck.isEmailExists(employer.getEmail())&&_credentialCheck.isPasswordMatch(employer.getPassword(), employer.getPasswordRepeat())) {
			if (_nullValidation.isEmployerHaveNullField(employer)) {
				return new SuccessDataResult<Employer>(_employerDao.save(employer), "İş veren kaydedildi.");
			}
			return new ErrorDataResult<Employer>("Bilgilerinizi eksiksiz doldurunuz.");
		}
		return new ErrorDataResult<Employer>("Bu mail adresi kayıtlı veya şifreler uyuşmuyor.");
		
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
