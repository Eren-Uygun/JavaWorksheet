package D5A1.dataAccess.concretes;

import java.util.ArrayList;

import D5A1.dataAccess.abstracts.IUserDao;
import D5A1.entities.concretes.LoginDto;
import D5A1.entities.concretes.User;

public class HibernateUserDao implements IUserDao {

	@Override
	public void register(User user) {
	System.out.println("Kayıt başarılı : "+user.getEmail());
		
	}

	@Override
	public void login(LoginDto login) {

		System.out.println("Giriş başarılı : "+login.getEmail());
		
	}

	@Override
	public ArrayList<User> getUsers() {
		
		User user1=new User();
		user1.setId(1);
		user1.setFirstName("David");
		user1.setLastName("Black");
		user1.setEmail("davidblack@mail.com");
		user1.setPassword("123456789");
	
		
		
		User user2=new User();
		user2.setId(2);
		user2.setFirstName("David");
		user2.setLastName("Green");
		user2.setEmail("davidgreen@mail.com");
		user2.setPassword("123456789");
		
		
		User user3=new User();
		user3.setId(3);
		user3.setFirstName("David");
		user3.setLastName("Purple");
		user3.setEmail("davidpurple@mail.com");
		user3.setPassword("123456789");
		
		User user4=new User();
		user4.setId(4);
		user4.setFirstName("David");
		user4.setLastName("Blue");
		user4.setEmail("davidblue@mail.com");
		user4.setPassword("123456789");
		
		ArrayList<User> users=new ArrayList<User>();
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		return users;
		
	}

}
