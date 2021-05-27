package kodlamaIo.Hrms.utils.checkService.concretes;

import java.util.List;

import kodlamaIo.Hrms.core.utils.result.ErrorResult;
import kodlamaIo.Hrms.dataAccess.abstracts.UserDao;
import kodlamaIo.Hrms.entities.concretes.User;

public class MailCheck {
	
private List<kodlamaIo.Hrms.entities.concretes.User> _user;
private static UserDao _userDao;

public MailCheck(List<User> user) {
	super();
	this._user = user;
}

public static boolean checkMail(String mail) {
	for (User  user: _userDao.findAll()) {	
		if (!user.getEmail().equals(mail)) {
			return true;
		}
		else {
			System.out.println("Mail adresi mevcuttur.");
			return false;
		}
	}
	return false;
	
}



}
