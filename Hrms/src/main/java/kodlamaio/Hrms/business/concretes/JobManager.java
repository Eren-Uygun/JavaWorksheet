package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobService;
import kodlamaio.Hrms.core.utilities.abstracts.CredentialCheckService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.ErrorResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobDao;
import kodlamaio.Hrms.entity.concretes.Job;

@Service
public class JobManager implements JobService {
	
	private JobDao _jobDao;
	private CredentialCheckService _credentialCheck;

	@Autowired
	public JobManager(JobDao jobDao,CredentialCheckService credentialCheck) {
		super();
		this._jobDao = jobDao;
		this._credentialCheck = credentialCheck;
	}

	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(_jobDao.findAll(), "İş verisi listelendi");
	}

	@Override
	public Result add(Job job) {
		if (_credentialCheck.jobCheck(job)) {
			return new ErrorResult("Kayıtlı iş adı");
		}
	return new SuccessDataResult<Job>(_jobDao.save(job),"İş kaydedildi.");
	}

}
