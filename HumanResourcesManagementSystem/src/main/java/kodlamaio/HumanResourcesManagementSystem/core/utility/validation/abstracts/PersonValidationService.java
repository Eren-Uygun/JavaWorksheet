package kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts;

public interface PersonValidationService {
	
	 boolean CheckIfRealPerson(String firstName,String lastName,int birthYear,String nationalIdentityNumber);

}
