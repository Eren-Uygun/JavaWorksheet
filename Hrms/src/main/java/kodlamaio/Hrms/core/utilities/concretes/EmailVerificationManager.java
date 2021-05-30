package kodlamaio.Hrms.core.utilities.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.abstracts.EmailVerificationService;
import kodlamaio.Hrms.entity.concretes.Employer;
import kodlamaio.Hrms.entity.concretes.JobSeeker;

@Service
public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public void sendMailJobSeeker(JobSeeker jobSeeker) {
		System.out.println("Onay maili yollandi : " + jobSeeker.getEmail());
		
	}

	@Override
	public void sendMailEmployer(Employer employer) {

		System.out.println("Onay maili yollandi : " + employer.getEmail());
		
	}

}
