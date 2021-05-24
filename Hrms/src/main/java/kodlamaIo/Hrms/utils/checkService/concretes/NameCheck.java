package kodlamaIo.Hrms.utils.checkService.concretes;

public class NameCheck {
	
	public static boolean nameCheck(String firstName,String lastName) {
		
		if (firstName.length()>=2 && !firstName.isEmpty() && lastName.length()>=2 &&!lastName.isEmpty()){
			return true;
		}
		else {
			System.out.println("Bilgilerinizi kontrol ediniz.Bilgileriniz en az 2 karakter olmalı ve boş olmamalıdır.");
			return false;
		}
		
	}

}
