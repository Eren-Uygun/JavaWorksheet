package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;

public interface ActivationService {
	
	Result activateCandidateAccountByEmail(int candidateId);
    Result activateEmployerAccountByEmail(int employerId);
    Result activateEmployerAccountByHrmsPersonal(int employerId, int employeeId);

}
