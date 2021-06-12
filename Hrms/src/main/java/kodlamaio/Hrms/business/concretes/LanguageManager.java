package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.LanguageService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
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
	public Result add(Language language) {
		return new SuccessDataResult<Language>(_languageDao.save(language),"Yabancı Dil Eklendi");
	}

	@Override
	public DataResult<Language> getById(int id) {
		return new SuccessDataResult<Language>(this._languageDao.getById(id));
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(this._languageDao.findAll());
	}

	@Override
	public DataResult<List<Language>> getAllByJobSeekerId(int id) {
		return new SuccessDataResult<List<Language>>(this._languageDao.getAllByCandidate_id(id));
	}

}
