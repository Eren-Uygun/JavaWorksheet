package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Language;

public interface LanguageService {
	
	Result add(Language language, int candidateId);

}
