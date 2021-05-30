package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobSeekerService;
import kodlamaio.Hrms.core.utilities.abstracts.EmailCheckService;
import kodlamaio.Hrms.core.utilities.abstracts.EmailVerificationService;
import kodlamaio.Hrms.core.utilities.abstracts.IdentityCheckService;
import kodlamaio.Hrms.core.utilities.abstracts.PasswordCheckService;
import kodlamaio.Hrms.core.utilities.concretes.MernisVerificationAdapter;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.ErrorResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.Hrms.entity.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	private JobSeekerDao jobSeekerDao;
	private EmailCheckService emailCheckService;
	private IdentityCheckService identityCheckService;
	private EmailVerificationService emailVerificationService;
	private MernisVerificationAdapter mernisVerificationService;
	private PasswordCheckService passwordCheckService;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, EmailCheckService emailCheckService,
			IdentityCheckService identityCheckService, EmailVerificationService emailVerificationService,
			MernisVerificationAdapter mernisVerificationAdapter,PasswordCheckService passwordCheckService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.emailCheckService = emailCheckService;
		this.identityCheckService = identityCheckService;
		this.emailVerificationService = emailVerificationService;
		this.mernisVerificationService = mernisVerificationService;
		this.passwordCheckService = passwordCheckService;
	}

	@Override
	public Result register(JobSeeker jobSeeker) {

		Result result = new SuccessResult("Kayit basarili.");

		if (emailCheckService.emailIsItUsed(jobSeeker.getEmail())) {
			result = new ErrorResult("Email sisteme kayitli.");
			return result;
		}
		if (identityCheckService.identityIsItUsed(jobSeeker.getIdentityNumber())) {
			result = new ErrorResult("Kimlik numarasi sisteme kayitli.");
			return result;
		}if(passwordCheckService.checkPassword(jobSeeker.getPassword(), jobSeeker.getPasswordRepeat())) {
			
		}
		else {
			// this.mernisVerificationService.mernisVerification(jobSeeker.getFirstName(),jobSeeker.getLastName(),jobSeeker.getBirthYear(),jobSeeker.getIdentityNumber());
			this.emailVerificationService.sendMailJobSeeker(jobSeeker);
			this.jobSeekerDao.save(jobSeeker);

		}
		return result;

	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {

		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "Data getirildi.");
	}

}
