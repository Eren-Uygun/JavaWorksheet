package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.*;

public interface CandidateService {
	
	Result add(Candidate candidate);
	DataResult<List<Candidate>> getAll();
	DataResult<Candidate> getByNationalityNumber(String nationalityNumber);

}
