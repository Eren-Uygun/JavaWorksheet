package kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts;

public interface CredentialRuleCheckService {
	public boolean isMailRuleOk(String email);
	public boolean isPasswordRuleOk(String password);

}
