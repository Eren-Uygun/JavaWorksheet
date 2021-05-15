package D5A1.business.abstracts;

import D5A1.entities.concretes.LoginDto;
import D5A1.entities.concretes.User;

public interface IUserService {
	void login(LoginDto Login);
	void Register(User user);
	

}
