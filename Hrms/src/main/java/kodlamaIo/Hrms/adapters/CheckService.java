package kodlamaIo.Hrms.adapters;

import java.rmi.RemoteException;
import java.time.LocalDate;


public interface CheckService {
	
	boolean checkIfRealPerson(String firstName,String lastName,String nationalIdentityNumber,LocalDate birthDate);
}

