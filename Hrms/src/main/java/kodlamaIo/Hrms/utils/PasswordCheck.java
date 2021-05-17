package kodlamaIo.Hrms.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordCheck {
	
	 private static final String PASSWORD_PATTERN ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
	 private static final Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
	 

/*
  ^                                # start of line
  (?=.*[0-9])                       # positive lookahead, digit [0-9]
  (?=.*[a-z])                       # positive lookahead, one lowercase character [a-z]
  (?=.*[A-Z])                       # positive lookahead, one uppercase character [A-Z]
  (?=.*[!@#&()–[{}]:;',?/*~$^+=<>]) # positive lookahead, one of the special character in this [..]
  .                                 # matches anything
  {8,20}                            # length at least 8 characters and maximum of 20 characters
$                                   # end of line
  */
	
	public static boolean passwordCheck(String password) {
		
		if (!password.isEmpty()&&password.length()>=6) {
			Matcher matcher = pattern.matcher(password);
			
			
			return true;
			
		}else {
			System.out.println("Şifrenizi kontrol ediniz.Şifreniz 6 haneden fazla olmalıdır.");
			return false;
		}
	}
	
	

}
