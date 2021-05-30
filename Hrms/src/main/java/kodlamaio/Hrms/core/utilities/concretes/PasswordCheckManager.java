package kodlamaio.Hrms.core.utilities.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.abstracts.PasswordCheckService;

@Service
public class PasswordCheckManager implements PasswordCheckService {

	@Override
	public boolean checkPassword(String password, String password2) {
	if (password.equals(password2)) {
		return true;
	}
	
	return false;
	
	}

}
