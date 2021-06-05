package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.ActivationService;
import kodlamaio.Hrms.business.abstracts.CandidateRegisterService;
import kodlamaio.Hrms.core.utilities.abstracts.CredentialCheckService;
import kodlamaio.Hrms.core.utilities.abstracts.MernisVerificiationService;
import kodlamaio.Hrms.core.utilities.abstracts.PasswordCheckService;
import kodlamaio.Hrms.core.utilities.result.ErrorResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.entity.concretes.Candidate;

@Service
public class CandidateRegisterManager implements CandidateRegisterService {
	
	private CandidateDao _candidateDao;
	private MernisVerificiationService _mernisVerificationService;
	private CredentialCheckService _credentialCheckService;;
	private PasswordCheckService _passwordCheckService;
	
	@Autowired
	public CandidateRegisterManager(CandidateDao _candidateDao, MernisVerificiationService _mernisVerificationService,
			 CredentialCheckService _credentialCheckService,
			PasswordCheckService _passwordCheckService) {
		super();
		this._candidateDao = _candidateDao;
		this._mernisVerificationService = _mernisVerificationService;
		
		this._credentialCheckService = _credentialCheckService;
		this._passwordCheckService = _passwordCheckService;
	}

	@Override
	public Result register(Candidate candidate) {
		if (!_mernisVerificationService.mernisVerification(candidate))
		{
		return new ErrorResult("Kimlik bilgileriniz doğrulanamadı.");
		}
		if (_credentialCheckService.checkIfRealEmailAddress(candidate.getEmail())) {
			return new ErrorResult("Mail adresiniz hatalı");
		}
		if (_credentialCheckService.checkIfCandidateCredentialsExists(candidate)) {
			return new ErrorResult("Mail adresiniz veya Tc kimlik numaranız sistemde kayıtlı");
		}
		if (_passwordCheckService.checkPassword(candidate.getPassword(),candidate.getPasswordRepeat())) {
			return new ErrorResult("Şifreniz aynı olmalıdır.");
		}
		if (!_credentialCheckService.nullCheckCandidate(candidate)) {
			return new ErrorResult("Bilgileriniz boş olmamalıdır.");
		}
		return new SuccessDataResult<Candidate>(_candidateDao.save(candidate),"Kayıt İşlemi Başarılı");
	}

}
