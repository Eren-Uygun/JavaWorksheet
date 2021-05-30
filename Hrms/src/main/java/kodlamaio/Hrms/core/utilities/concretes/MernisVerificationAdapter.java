package kodlamaio.Hrms.core.utilities.concretes;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.abstracts.MernisVerificiationService;

@Service
public class MernisVerificationAdapter implements MernisVerificiationService {

	@Override
	public boolean mernisVerification(String firstName, String lastName, int birthYear,
			String nationalIdentityNumber) {
		// TODO Auto-generated method stub
		return true;
	}

}
