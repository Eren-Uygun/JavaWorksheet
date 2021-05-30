package kodlamaio.Hrms.core.utilities.abstracts;

import java.time.LocalDate;

public interface MernisVerificiationService {
	public boolean mernisVerification(String firstName,String lastName,int birthYear,String nationalIdentityNumber);
}
