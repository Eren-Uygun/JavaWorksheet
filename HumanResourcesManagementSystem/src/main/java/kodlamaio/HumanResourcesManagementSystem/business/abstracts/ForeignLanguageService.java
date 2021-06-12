package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.ForeignLanguage;

public interface ForeignLanguageService {
	Result  add(ForeignLanguage ForeignLanguage );
	DataResult<List<ForeignLanguage>> getAll();

}
