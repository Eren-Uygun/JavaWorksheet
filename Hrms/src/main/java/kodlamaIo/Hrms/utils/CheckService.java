package kodlamaIo.Hrms.utils;

import java.time.LocalDate;

public interface CheckService {
	
 boolean	checkIfRealPerson(String nationalIdentityNumber,String firstName,String lastName,LocalDate birthDate);
		
	

}
