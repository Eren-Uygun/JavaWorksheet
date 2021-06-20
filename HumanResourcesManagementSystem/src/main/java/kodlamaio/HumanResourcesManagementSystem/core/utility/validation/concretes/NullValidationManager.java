package kodlamaio.HumanResourcesManagementSystem.core.utility.validation.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.NullValidationService;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employer;

@Service
public class NullValidationManager implements NullValidationService {

	@Override
	public boolean isEmployerHaveNullField(Employer employer) {
		if (!(employer.getCompanyName().isBlank()&&employer.getEmail().isBlank()&&employer.getWebSite().isBlank()&&employer.getTelephoneNumber().isBlank())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmployeeHaveNullField(Employee employee) {
		if (!(employee.getEmail().isBlank()&&employee.getFirstName().isBlank()&&employee.getLastName().isBlank()&&employee.getDepartment().isBlank())) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isCandidateHaveNullField(Candidate candidate) {
		if(!(candidate.getFirstName().isBlank()&&candidate.getLastName().isBlank()&&candidate.getEmail().isBlank()))
		{
			return true;
		}
		return false;
	}

}
