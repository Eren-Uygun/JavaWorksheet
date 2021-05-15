package Homework_3;

public class UserManager {
	
	public void addUser(User user) {
		System.out.println(user.email+" Adlı Kullanıcı Sisteme eklendi. " + (" Hoşgeldiniz "+ user.firstName + " " +user.lastName ).toUpperCase());
		
	}
	
	public void updateUser(User user) {
		System.out.println(user.email+" Adlı Kullanıcının bilgileri güncellendi. ");
		
	}
	
	
	public void removeUser(User user) {
		System.out.println(user.email+" Adlı Kullanıcı Sistemden Silindi." );
	
	}
	
	
	

}
