package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.result.Result;

public interface ActivationService {
	
	Result activateCandidateAccountByEmail(int candidateId);
    Result activateEmployerAccountByEmail(int employerId);
    Result activateEmployerAccountByHrmsPersonal(int employerId, int employeeId);
    
}
