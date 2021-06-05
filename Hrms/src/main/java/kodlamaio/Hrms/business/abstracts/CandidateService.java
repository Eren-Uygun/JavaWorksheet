package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.entity.concretes.Candidate;

public interface CandidateService {
	    DataResult<List<Candidate>> getAll();
	 //   Result add(Candidate candidate); CandidateRegister servisinde yapıldı.
	    Result delete(int candidateId);

}
