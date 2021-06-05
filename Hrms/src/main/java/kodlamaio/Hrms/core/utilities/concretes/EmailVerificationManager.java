package kodlamaio.Hrms.core.utilities.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.abstracts.EmailVerificationService;

@Service
public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public void sendVerificationMail(String email) {
		
		System.out.println("Onay maili gönderildi : " + email);
		
	}

}
