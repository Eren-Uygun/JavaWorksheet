package kodlamaio.HumanResourcesManagementSystem.core.utility.validation.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.CredentialValidationService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.JobDao;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.UserDao;
import kodlamaio.HumanResourcesManagementSystem.entities.abstracts.User;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Job;

@Service
public class CredentialValidationManager implements CredentialValidationService {
	
	private UserDao _userDao;
	private JobDao _jobDao;
	
	@Autowired
	public CredentialValidationManager(UserDao userDao,JobDao jobDao) {
		super();
		this._userDao = userDao;
		this._jobDao = jobDao;
	}

	@Override
	public boolean isEmailExists(String email) {
		List<User> userList = _userDao.findAll();
		for (User checkUser : userList) {	
			if (!(checkUser.getEmail() == email)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isPasswordMatch(String password, String confirmPassword) {
		if (password == confirmPassword) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isJobExists(String jobName) {
		List<Job> jobList = _jobDao.findAll();
		for (Job checkJob : jobList) {	
			if (!(checkJob.getJobName() == jobName)) {
				return true;
			}
		}
		return false;
	}

}
