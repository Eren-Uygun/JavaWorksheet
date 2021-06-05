package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>> getAll();
    DataResult<List<JobAdvertisement>> getAllSorted();
    DataResult<List<JobAdvertisement>> getAllByCompanyId(int id);
    DataResult<List<JobAdvertisement>> getAllByCompanyName(String companyName);

    Result add(JobAdvertisement jobAdvertisement);
    Result activate(int id, boolean activationStatus);
}
