package kodlamaio.Hrms.core.utilities.concretes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.abstracts.CredentialCheckService;
import kodlamaio.Hrms.core.utilities.result.ErrorResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.dataAccess.abstracts.CityDao;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.Hrms.dataAccess.abstracts.JobDao;
import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.concretes.City;
import kodlamaio.Hrms.entity.concretes.Employer;
import kodlamaio.Hrms.entity.concretes.Job;
import kodlamaio.Hrms.entity.concretes.JobAdvertisement;

@Service
public class CredentialCheckManager implements CredentialCheckService {
	
	private CandidateDao _candidateDao;
	private EmployerDao _employerDao;
	private CityDao _cityDao;
	private JobAdvertisementDao _jobAdvertisementDao;
	private JobDao _jobDao;
	
	@Autowired
	public CredentialCheckManager(CandidateDao candidateDao,EmployerDao employerDao,CityDao cityDao,JobAdvertisementDao jobAdvertisementDao,JobDao jobDao) {
		super();
		this._candidateDao = candidateDao;
		this._employerDao = employerDao;
		this._cityDao = cityDao;
		this._jobAdvertisementDao = jobAdvertisementDao;
		this._jobDao = jobDao;
	}
	


	@Override
	public boolean checkIfRealEmailAddress(String emailAddress) {
		
			String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

			Pattern pattern = Pattern.compile(regex);

			Matcher matcher = pattern.matcher(emailAddress);

			if (matcher.matches()) {

				return true;

			}

			return false;
	}

	@Override
	public boolean checkIfCandidateCredentialsExists(Candidate candidate) {
		List<Candidate> candidateList = _candidateDao.findAll();
		for (Candidate checkCandidate : candidateList) {
			if (checkCandidate.getEmail().equals(candidate.getEmail())&&checkCandidate.getNationalIdentityNumber().equals(candidate.getNationalIdentityNumber())) {
			return true;	
			}
		}
		return false;	
	}



	@Override
	public boolean nullCheckCandidate(Candidate candidate) {
		if (candidate.getFirstName().isBlank() && candidate.getLastName().isBlank() && candidate.getNationalIdentityNumber().isBlank() && candidate.getPassword().isBlank() && candidate.getPasswordRepeat().isBlank() && candidate.getEmail().isBlank()) {
			return true;
		}
		return false;
		
	}



	@Override
	public boolean nullCheckEmployer(Employer employer) {
		if (!(employer.getCompanyName().isBlank() && employer.getEmail().isBlank() && employer.getWebSite().isBlank() && employer.getPassword().isBlank() && employer.getPasswordRepeat().isBlank()&&employer.getTelephoneNumber().isBlank())) {
			return true;
		}
		return false;
	}



	@Override
	public boolean checkIfEmployerCredentialsExists(Employer employer) {
		List<Employer> employerList = _employerDao.findAll();
        for (Employer checkEmployer : employerList){
            if (checkEmployer.getEmail().equals(employer.getEmail()))
                return true;
        }
        return false;
	}



	@Override
	public boolean checkCityExists(JobAdvertisement jobAdvertisement) {
		if (_cityDao.existsById(jobAdvertisement.getCities().getId())) {
			 return true;
		}
		return false;
	}



	@Override
	public boolean isEmployerExists(JobAdvertisement jobAdvertisement) {
		 if (_employerDao.existsById(jobAdvertisement.getEmployer().getId())) {
	            return true;
	        }

	        return false;
	}


//Bu bölüm daha düzgün bir hale getirilecek. Çorba oldu.
	@Override
	public boolean nullCheckJobAdvertisement(JobAdvertisement jobAdvertisement) {
		if (!(jobAdvertisement.getJobInfo().isBlank() && jobAdvertisement.getReleaseDate() == null && jobAdvertisement.getEndDate() == null)) {
			if (!(jobAdvertisement.getEndDate().after(jobAdvertisement.getReleaseDate()))&&!(jobAdvertisement.getReleaseDate().equals(jobAdvertisement.getEndDate()))) {
				if (jobAdvertisement.getNum_of_position() > 0) {
					if (!(jobAdvertisement.getMin_wage()<=jobAdvertisement.getMax_wage())) {
						return true;
					}
					return false;
				}
				return false;
			}
			return false;
		}
		return false;
	}



	@Override
	public boolean jobCheck(Job job) {
		
		List<Job> jobList = _jobDao.findAll();
        for (Job checkJob : jobList){
            if (checkJob.getJobName().equals(job.getJobName())){
              return true;
            }
            else {
            	return false;
            }
        }
        return false;
	}




	

	
}
