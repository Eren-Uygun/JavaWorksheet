package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.JobAdvertisementService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao _jobAdvertisementDao;
	
@Autowired
	public JobAdvertisementManager(JobAdvertisementDao _jobAdvertisementDao) {
		super();
		this._jobAdvertisementDao = _jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		return new SuccessDataResult<JobAdvertisement>(_jobAdvertisementDao.save(jobAdvertisement), "İş detayı eklendi.");
	}

	@Override
	public Result changeJobAdvertisementStatus(int jobAdvertisementId) {
		var jobAdvertisement = _jobAdvertisementDao.getById(jobAdvertisementId);
		if (jobAdvertisement.isActive()) {
			jobAdvertisement.setActive(false);
		return new SuccessResult("İlan pasif hale getirildi.");
		}
		if (!jobAdvertisement.isActive()) {
			jobAdvertisement.setActive(true);
			return new SuccessResult("İlan aktif hale getirildi.");
		}
		
		return new ErrorResult("Aktivan bölümü hatalı");
		
		
	}

	@Override
	public DataResult<JobAdvertisement> getByJobAdvertisementId(int jobAdvertisementId) {
		var result = _jobAdvertisementDao.getById(jobAdvertisementId);
		if (result == null) {
			return new ErrorDataResult<JobAdvertisement>("Böyle bir iş ilanı bulunamadı");
		}
		return new SuccessDataResult<JobAdvertisement>(result);
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByActiveJobAdvertisements() {
		return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.getByIsActive(true));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByReleaseDateJobPosting(int value) {
		Sort sort;
		if (value == 0) {
			sort = Sort.by(Sort.Direction.DESC, "releaseDate");
		} else {
			sort = Sort.by(Sort.Direction.ASC, "releaseDate");
		}
		return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.getByIsActive(true, sort));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByEmployerJobAdvertisement(int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.getByIsActiveAndEmployer_id(true, employerId));
	}

}
