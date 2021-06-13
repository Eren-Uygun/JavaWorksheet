package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployeeService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.CredentialValidationService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.NullValidationService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployeeDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService
{
	private EmployeeDao _employeeDao;
	private CredentialValidationService _credentialValidation;
	private NullValidationService _nullValidation;
	
	


	@Autowired
	public EmployeeManager(EmployeeDao _employeeDao, CredentialValidationService _credentialValidation,NullValidationService nullValidationService) {
		super();
		this._employeeDao = _employeeDao;
		this._credentialValidation = _credentialValidation;
		this._nullValidation = nullValidationService;
	}

	@Override
	public Result add(Employee employee) {

		if (_credentialValidation.isEmailExists(employee.getEmail())&&_credentialValidation.isPasswordMatch(employee.getPassword(), employee.getPasswordRepeat())) {
			if (_nullValidation.isEmployeeHaveNullField(employee)) {
				return new SuccessDataResult<Employee>(_employeeDao.save(employee), "Sistem personeli eklendi");
			}
			return new ErrorDataResult<Employee>("Bilgilerinizi eksiksiz doldurunuz.");
			
		}
		return new ErrorDataResult<Employee>("Bu mail adresi kayıtlı veya şifreler uyuşmuyor.");
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(_employeeDao.findAll(), "Sistem personel listesi getirildi.");
	}

}
