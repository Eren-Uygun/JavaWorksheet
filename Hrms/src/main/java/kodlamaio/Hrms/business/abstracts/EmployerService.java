package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.entity.concretes.Employer;

public interface EmployerService {
	
	     DataResult<List<Employer>> getAll();
	  //  void validate(Employer employer);
}
