package kodlamaIo.Hrms.business.abstracts;

import java.util.List;

import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.entities.concretes.Candidate;
import kodlamaIo.Hrms.entities.concretes.Employer;

public interface EmployerService {

	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
}
