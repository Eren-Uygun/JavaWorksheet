package kodlamaIo.Hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaIo.Hrms.business.abstracts.UserService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.ErrorDataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.core.utils.result.SuccessDataResult;
import kodlamaIo.Hrms.dataAccess.abstracts.UserDao;
import kodlamaIo.Hrms.entities.concretes.User;
import kodlamaIo.Hrms.utils.checkService.concretes.MailCheck;
import kodlamaIo.Hrms.utils.checkService.concretes.PasswordCheck;

@Service
public class UserManager implements UserService {

	private UserDao _userDao;
	
	/**
	 * @param _userDao
	 */
	public UserManager(UserDao _userDao) {
		super();
		this._userDao = _userDao;
	}

	@Override
	public DataResult<List<User>> getAll() {
		try {
			return new DataResult<List<User>>(_userDao.findAll(), true, "Kullanıcılar listelendi");
		} catch (Exception e) {
			return new ErrorDataResult<List<User>>("Kullanıcılar listelenemedi.");
		}
		
		
	}

	@Override
	public Result add(User user) {
		try {	
		if (PasswordCheck.passwordCheck(user.getPassword())) {
			return new  SuccessDataResult<User>(_userDao.save(user),"Kullanıcı kayıt edildi");
		}
		else {
			return new ErrorDataResult<User>("Bilgilerinizi kontrol ediniz.");
		}
		} catch (Exception e) {
			return new ErrorDataResult<User>("Bilgilerinizi kontrol ediniz.");
		}
	}

}
