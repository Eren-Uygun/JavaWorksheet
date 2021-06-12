package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.ForeignLanguageService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.ForeignLanguageDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.ForeignLanguage;

@Service
public class ForeignLanguageManager implements ForeignLanguageService {

	private ForeignLanguageDao _foreignLanguageDao;
	

	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao _foreignLanguageDao) {
		super();
		this._foreignLanguageDao = _foreignLanguageDao;
	}

	@Override
	public Result add(ForeignLanguage foreignLanguage) {
		return new SuccessDataResult<ForeignLanguage>(_foreignLanguageDao.save(foreignLanguage), "Yabancı dil bilgisi eklendi");
	}

	@Override
	public DataResult<List<ForeignLanguage>> getAll() {
		return new SuccessDataResult<List<ForeignLanguage>>(_foreignLanguageDao.findAll(), "Yabancı dil bilgileri listelendi.");
	}

}
