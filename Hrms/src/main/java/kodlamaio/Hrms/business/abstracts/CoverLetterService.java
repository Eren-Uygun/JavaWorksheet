package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.CoverLetter;

public interface CoverLetterService {
	
	Result add(CoverLetter coverLetter);
	DataResult<CoverLetter> getById(int id);	
	DataResult<List<CoverLetter>> getAll();

}
