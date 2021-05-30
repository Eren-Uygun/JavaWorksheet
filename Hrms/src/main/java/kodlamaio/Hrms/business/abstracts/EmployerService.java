package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Employer;

public interface EmployerService {
	
	public DataResult<List<Employer>> getAll();
	public Result register(Employer employer);
	
}
