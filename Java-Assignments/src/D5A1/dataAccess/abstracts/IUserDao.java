package D5A1.dataAccess.abstracts;

import java.util.ArrayList;

import D5A1.entities.concretes.LoginDto;
import D5A1.entities.concretes.User;

public interface IUserDao {
	
	public void register(User user);
	public void login(LoginDto login);
	public ArrayList<User> getUsers();
	
	

}
