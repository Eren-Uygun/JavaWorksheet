package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.ActivationService;
import kodlamaio.Hrms.business.abstracts.EmployerRegisterService;
import kodlamaio.Hrms.core.utilities.abstracts.CredentialCheckService;
import kodlamaio.Hrms.core.utilities.abstracts.MernisVerificiationService;
import kodlamaio.Hrms.core.utilities.abstracts.PasswordCheckService;
import kodlamaio.Hrms.core.utilities.result.ErrorResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.entity.concretes.Employer;

@Service
public class EmployerRegisterManager implements EmployerRegisterService {

	private EmployerDao _employerDao;
	private CredentialCheckService _credentialCheckService;;
	private PasswordCheckService _passwordCheckService;
	
	
	

	@Autowired
	public EmployerRegisterManager(EmployerDao _employerDao, CredentialCheckService _credentialCheckService,
			PasswordCheckService _passwordCheckService) {
		super();
		this._employerDao = _employerDao;
		this._credentialCheckService = _credentialCheckService;
		this._passwordCheckService = _passwordCheckService;
	}



	@Override
	public Result register(Employer employer) {
		/*
		if (_credentialCheckService.checkIfRealEmailAddress(employer.getEmail())) {
			return new ErrorResult("Mail adresiniz hatalı");
		}
		*/
		if (_credentialCheckService.checkIfEmployerCredentialsExists(employer)) {
			return new ErrorResult("Mail adresiniz veya Tc kimlik numaranız sistemde kayıtlı");
		}
		if (_passwordCheckService.checkPassword(employer.getPassword(),employer.getPasswordRepeat())) {
			return new ErrorResult("Şifreniz aynı olmalıdır.");
		}
		if (!_credentialCheckService.nullCheckEmployer(employer)) {
			return new ErrorResult("Bilgileriniz boş olmamalıdır.");
		}
		return new SuccessDataResult<Employer>(_employerDao.save(employer),"Kayıt İşlemi Başarılı, aktivasyon maili gönderildi.");
	}


}
