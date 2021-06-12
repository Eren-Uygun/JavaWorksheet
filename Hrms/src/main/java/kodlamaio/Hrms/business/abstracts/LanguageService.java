package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Language;

public interface LanguageService {
	
	Result add(Language language);
	DataResult<Language> getById(int id);
	DataResult<List<Language>>  getAll();
	DataResult<List<Language>>  getAllByJobSeekerId(int id);

}
