package D5A1.business.concretes;

import D5A1.business.abstracts.IUserService;
import D5A1.core.utils.AuthValidator;
import D5A1.core.utils.UserValidator;
import D5A1.dataAccess.abstracts.IUserDao;
import D5A1.dataAccess.concretes.HibernateUserDao;
import D5A1.entities.concretes.LoginDto;
import D5A1.entities.concretes.User;

public class UserManager implements IUserService {
	
	IUserDao _userDao;

	public UserManager(IUserDao _userDao) {
		super();
		this._userDao = _userDao;
	}

	@Override
	public void login(LoginDto login) {
		
		if (UserValidator.checkPassword(login.getPassword())) {
			_userDao.login(login);
		}
		else {
			System.out.println("Giriş bilgileriniz hatalıdır.");
		}
		
	}

	@Override
	public void Register(User user) {
		if (AuthValidator.registerCheckExistEmail(user)&&UserValidator.checkEmail(user.getEmail())&&UserValidator.checkPassword(user.getPassword())&&UserValidator.checkUser(user.getFirstName(),user.getLastName())) {
			_userDao.register(user);
		}
		else {
			System.out.println("Bilgilerinizi kontrol ediniz.");
		}
		
	}

}
