package D5A1.consoleUI;

import D5A1.business.concretes.UserManager;
import D5A1.core.adapters.abstracts.IAuthAdapter;
import D5A1.core.adapters.concretes.GoogleAuth;
import D5A1.core.adapters.concretes.GoogleAuthAdapter;
import D5A1.dataAccess.concretes.HibernateUserDao;
import D5A1.entities.concretes.LoginDto;
import D5A1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		IAuthAdapter _authAdapter = new GoogleAuthAdapter();
		LoginDto login=new LoginDto();
		login.setEmail("davidblue@mail.com");
		login.setPassword("123456789");
		
		User user=new User();
		user.setId(1);
		user.setFirstName("David");
		user.setLastName("Yellow");
		user.setEmail("davidyellow@mail.com");
		user.setPassword("123456789");
	
		UserManager userManager= new UserManager(new HibernateUserDao());
		userManager.Register(user);
		userManager.login(login);
		_authAdapter.loginExternal(user.getEmail());
		

	}
		
		

	}


