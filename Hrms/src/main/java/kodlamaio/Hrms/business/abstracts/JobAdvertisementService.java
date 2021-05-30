package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	public Result add(JobAdvertisement jobAdvertisement);
	public DataResult<List<JobAdvertisement>> getAll();
	public DataResult<List<JobAdvertisement>> getByIsActive();
	public DataResult<List<JobAdvertisement>> getAllSortedByDeadline();
	
	public DataResult<List<JobAdvertisement>> getByEmployer_CompanyNameAndIsActive(String companyName);
	
	public Result update(int id , boolean isActive);

}
