package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.EmployerService;
import kodlamaio.Hrms.core.utilities.abstracts.EmailCheckService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.ErrorResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.entity.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	private EmailCheckService emailCheckService;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao, EmailCheckService emailCheckService) {
		super();
		this.employerDao = employerDao;
		this.emailCheckService = emailCheckService;
	}


	@Override
	public Result register(Employer employer) {

		Result result = new SuccessResult("Kayit basarili.");

		if (emailCheckService.emailIsItUsed(employer.getEmail())) {
			result = new ErrorResult("Email sisteme kayitli.");
			return result;
		}
		else {
			this.employerDao.save(employer);
			
		}
		return result;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Data getirildi.");
	}

}
