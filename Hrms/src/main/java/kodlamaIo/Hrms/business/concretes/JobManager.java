package kodlamaIo.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaIo.Hrms.business.abstracts.JobService;
import kodlamaIo.Hrms.dataAccess.abstracts.JobDao;
import kodlamaIo.Hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {
	
	private JobDao _jobDao;

	@Autowired
	public JobManager(JobDao _jobDao) {
		super();
		this._jobDao = _jobDao;
	}

	@Override
	public List<Job> getAll() {
		return _jobDao.findAll();
	}

}
