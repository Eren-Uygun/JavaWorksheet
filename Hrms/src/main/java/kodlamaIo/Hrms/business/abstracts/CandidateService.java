package kodlamaIo.Hrms.business.abstracts;

import java.util.List;

import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.entities.concretes.Candidate;

public interface CandidateService {
	
	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);
	
	

}
