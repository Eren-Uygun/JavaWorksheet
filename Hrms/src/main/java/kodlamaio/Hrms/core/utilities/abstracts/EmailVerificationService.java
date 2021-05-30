package kodlamaio.Hrms.core.utilities.abstracts;

import kodlamaio.Hrms.entity.concretes.Employer;
import kodlamaio.Hrms.entity.concretes.JobSeeker;

public interface EmailVerificationService {
	public void sendMailJobSeeker(JobSeeker jobSeeker);
	public void sendMailEmployer(Employer employer);
}
