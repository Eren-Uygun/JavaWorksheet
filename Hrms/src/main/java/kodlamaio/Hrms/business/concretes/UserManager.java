package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.UserService;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.UserDao;
import kodlamaio.Hrms.entity.abstracts.User;

@Service
public class UserManager implements UserService {

	private UserDao _userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this._userDao = userDao;
	}


	@Override
	public Result add(User user) {
		_userDao.save(user);
		return new SuccessDataResult<User>(user, "Kullanıcı sisteme eklendi.");
	}

}
