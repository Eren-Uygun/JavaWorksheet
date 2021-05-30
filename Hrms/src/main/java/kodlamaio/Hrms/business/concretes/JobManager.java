package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobDao;
import kodlamaio.Hrms.entity.concretes.Job;

@Service
public class JobManager implements JobService {

private JobDao _jobPositionDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this._jobPositionDao = jobDao;
	}

	@Override
	public Result add(Job jobPosition) {
		this._jobPositionDao.save(jobPosition);
		return new SuccessResult("Data eklendi.");
	}

	@Override
	public DataResult<List<Job>> getAll() {

		return new SuccessDataResult<List<Job>>(this._jobPositionDao.findAll(), "Data getirildi.");
	}

}
