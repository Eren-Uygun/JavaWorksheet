package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.LanguageService;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.dataAccess.abstracts.LanguageDao;
import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.concretes.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageDao _languageDao;
	private CandidateDao _candidateDao;
	

	@Autowired
	public LanguageManager(LanguageDao _languageDao, CandidateDao _candidateDao) {
		super();
		this._languageDao = _languageDao;
		this._candidateDao = _candidateDao;
	}

	@Override
	public Result add(Language language, int candidateId) {
		 Candidate candidate = _candidateDao.findById(candidateId).get();
	        language.setCandidate(candidate);
	        candidate.getLanguage().add(language);
	        _languageDao.save(language);
	        return new SuccessDataResult<Language>(language,"Dil sisteme eklendi.");
	}

}
