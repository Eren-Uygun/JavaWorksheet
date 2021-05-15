package D5A1.core.utils;

import D5A1.dataAccess.concretes.HibernateUserDao;
import D5A1.entities.concretes.User;

public class AuthValidator {
	
	public static boolean registerCheckExistEmail(User user) {
		HibernateUserDao memoryDao = new HibernateUserDao();
		for (User _user : memoryDao.getUsers()) {
			if (user.getEmail().equals(_user.getEmail())) {
				return false;
			}
		}
		return true;
		
		
	}

}
