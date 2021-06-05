package kodlamaio.Hrms.core.utilities.abstracts;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.concretes.City;
import kodlamaio.Hrms.entity.concretes.Employer;
import kodlamaio.Hrms.entity.concretes.Job;
import kodlamaio.Hrms.entity.concretes.JobAdvertisement;

public interface CredentialCheckService {
	
	public boolean checkIfRealEmailAddress(String emailAddress);
	public boolean checkIfCandidateCredentialsExists(Candidate candidate);
	public boolean checkIfEmployerCredentialsExists(Employer employer);
	public boolean nullCheckCandidate(Candidate candidate);
	public boolean nullCheckEmployer(Employer employer);
	public boolean nullCheckJobAdvertisement(JobAdvertisement jobAdvertisement);
	public boolean checkCityExists(JobAdvertisement jobAdvertisement);
	public boolean isEmployerExists(JobAdvertisement jobAdvertisement);
	public boolean jobCheck(Job job);

	
	
	
	
	
	
	

}
