package kodlamaIo.Hrms.business.abstracts;

import java.util.List;

import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.entities.concretes.Candidate;
import kodlamaIo.Hrms.entities.concretes.Job;

public interface JobService {
	
	DataResult<List<Job>> getAll();
	Result add(Job job);

}
