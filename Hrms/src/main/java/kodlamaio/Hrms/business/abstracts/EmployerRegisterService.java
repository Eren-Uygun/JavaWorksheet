package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Employer;

public interface EmployerRegisterService {
	
	    Result register(Employer employer);
}
