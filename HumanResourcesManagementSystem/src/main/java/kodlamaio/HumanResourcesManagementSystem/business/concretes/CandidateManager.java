package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CandidateService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.CredentialValidationService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.NullValidationService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.ActivationCodeCandidateDao;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.ActivationCodeEmployerDao;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.CandidateDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.ActivationCodeCandidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;

@Service
public class CandidateManager implements CandidateService {
	
	
	private CandidateDao _candidateDao;
	private CredentialValidationService _credentialValidation;
	private NullValidationService _nullValidation;
	

	@Autowired
	public CandidateManager(CandidateDao _candidateDao, CredentialValidationService _credentialValidation,NullValidationService nullValidation) {
		super();
		this._candidateDao = _candidateDao;
		this._credentialValidation = _credentialValidation;
		this._nullValidation = nullValidation;
	}

	@Override
	public Result add(Candidate candidate) {
		if (_credentialValidation.isEmailExists(candidate.getEmail())&&_credentialValidation.isPasswordMatch(candidate.getPassword(), candidate.getPasswordRepeat())) {
			if(_nullValidation.isCandidateHaveNullField(candidate))
			{
				return new SuccessDataResult<Candidate>(_candidateDao.save(candidate), "İş arayan aday sisteme eklendi.");
			}
			return new ErrorDataResult<Candidate>("Bilgilerinizi eksiksiz doldurunuz.");
		}
		return new ErrorDataResult<Candidate>("Bu mail adresi kayıtlı veya şifreler uyuşmuyor.");
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(_candidateDao.findAll(), "İş arayan adaylar getirildi.");
	}

	@Override
	public DataResult<Candidate> getByNationalityNumber(String nationalityNumber) {
		return new SuccessDataResult<Candidate>(_candidateDao.getByNationalIdentityNumber(nationalityNumber),"İş arayan aday getirildi.");
	}

}
