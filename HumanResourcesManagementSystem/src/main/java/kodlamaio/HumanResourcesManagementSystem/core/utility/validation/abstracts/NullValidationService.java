package kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts;


import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employer;

public interface NullValidationService {
	
	public boolean isEmployerHaveNullField(Employer employer);
	public boolean isEmployeeHaveNullField(Employee employee);
	public boolean isCandidateHaveNullField(Candidate candidate);

}
