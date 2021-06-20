package kodlamaio.HumanResourcesManagementSystem.core.utility.validation.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.CredentialRuleCheckService;

@Service
public class CredentialRuleCheckManager implements CredentialRuleCheckService {

	 final String emailRegex = "^(.+)@(.+)$";
	    final String passwordRegex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";


	    @Override
	    public boolean isMailRuleOk(String email) {
	        Pattern emailPattern = Pattern.compile(emailRegex);
	        Matcher matcher = emailPattern.matcher(email);
	        if (matcher.matches())
	        {
	            return true;
	        }
	        return false;

	    }

	    @Override
	    public boolean isPasswordRuleOk(String password) {
	        /*
	        Pattern passwordPattern = Pattern.compile(passwordRegex);
	        Matcher matcher = passwordPattern.matcher(password);
	        if (matcher.matches())
	        {
	            return true;
	        }
	*/
	        return true;

	    }
}
