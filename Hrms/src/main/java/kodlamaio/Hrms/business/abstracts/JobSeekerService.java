package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.JobSeeker;

public interface JobSeekerService {
	public Result register(JobSeeker jobSeeker);
	public DataResult<List<JobSeeker>> getAll();
}
