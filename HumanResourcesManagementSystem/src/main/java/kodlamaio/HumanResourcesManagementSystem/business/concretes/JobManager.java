package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.JobService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.JobDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Job;

@Service
public class JobManager implements JobService {

	private JobDao _jobDao;
	
	@Autowired
	public JobManager(JobDao _jobDao) {
		super();
		this._jobDao = _jobDao;
	}

	@Override
	public Result add(Job job) {
		return new SuccessDataResult<Job>(_jobDao.save(job), "İş adı eklendi.");
	}

	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(_jobDao.findAll(), "İş listesi getirildi.");
	}

	@Override
	public DataResult<Job> getById(int id) {
		var result = _jobDao.getById(id);
		if (result == null) {
			return new ErrorDataResult<Job>("Böyle bir iş pozisyonu bulunamadı");
		}
		return new SuccessDataResult<Job>(result);
	}

}
