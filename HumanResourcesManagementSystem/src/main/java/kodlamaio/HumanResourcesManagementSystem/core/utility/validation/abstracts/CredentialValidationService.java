package kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts;

public interface CredentialValidationService {
	
	public boolean isEmailExists(String email);
	public boolean isPasswordMatch(String password,String confirmPassword);
	public boolean isJobExists(String jobName);

}
