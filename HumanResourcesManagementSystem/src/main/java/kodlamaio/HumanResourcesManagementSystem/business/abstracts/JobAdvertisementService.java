package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	Result add(JobAdvertisement jobAdvertisement);

	Result changeJobAdvertisementStatus(int jobAdvertisementId);

	DataResult<JobAdvertisement> getByJobAdvertisementId(int jobAdvertisementId);

	DataResult<List<JobAdvertisement>> getByActiveJobAdvertisements();

	DataResult<List<JobAdvertisement>> getByReleaseDateJobPosting(int value);

	DataResult<List<JobAdvertisement>> getByEmployerJobAdvertisement(int employerId);

}
