package kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts;

public interface CredentialRuleCheck {
	public boolean isMailRuleOk(String email);
	public boolean isPasswordRuleOk(String password);

}
