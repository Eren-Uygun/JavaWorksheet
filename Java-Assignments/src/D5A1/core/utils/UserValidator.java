package D5A1.core.utils;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UserValidator {
	
//	private static final String emailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	private static final String emailPattern ="^(.+)@(.+)$";
	public static boolean checkEmail(String email){
	 Pattern pattern = Pattern.compile(emailPattern,Pattern.CASE_INSENSITIVE);
	 Matcher matcher = pattern.matcher(emailPattern);
	 
	 if (matcher.matches()) {
		 return true;
		}
	 else {
		 System.out.println("Mail bilgilerinizi kontrol ediniz.");
		 return false;
	 }
		
	}
	

	public static boolean checkPassword(String password) {
		if (password.length()>=6) {
			return true;
			
		}
		else {
			System.out.println("Şifreniz en 6 karakterden oluşmalıdır.");
			return false;
		}
	}
	

	public static boolean checkUser(String firstName,String lastName) {
		if (firstName.length()>=2 && lastName.length() >=2) {
			return true;
		}
		else {
			System.out.println("Adınız ve soyadınız en az 2 karakterden oluşmalıdır.");
			return false;
		}
	}

}

