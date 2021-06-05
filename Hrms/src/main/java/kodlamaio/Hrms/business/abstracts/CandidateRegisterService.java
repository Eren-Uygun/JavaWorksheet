package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Candidate;

public interface CandidateRegisterService {
	
	    Result register(Candidate candidate);
}
