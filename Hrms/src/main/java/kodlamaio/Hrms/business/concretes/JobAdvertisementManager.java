package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.abstracts.CredentialCheckService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.ErrorDataResult;
import kodlamaio.Hrms.core.utilities.result.ErrorResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CityDao;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.Hrms.dataAccess.abstracts.JobDao;
import kodlamaio.Hrms.entity.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	
	private JobAdvertisementDao _jobAdvertisementDao;
	private EmployerDao _employerDao;
	private CityDao _cityDao;
	private JobDao _jobDao;
	private CredentialCheckService _checkService;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao _jobAdvertisementDao, EmployerDao _employerDao, CityDao _cityDao,
			JobDao _jobDao) {
		super();
		this._jobAdvertisementDao = _jobAdvertisementDao;
		this._employerDao = _employerDao;
		this._cityDao = _cityDao;
		this._jobDao = _jobDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
	return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.getAllByActivatedTrue(), "Tüm aktif ilanlar listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.DESC, "releaseDate");
        return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.getAllByActivatedTrue(sort),"İlanlar oluşturulma tarihine göre sondan başa listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByCompanyId(int id) {
		 if (!_jobAdvertisementDao.existsById(id)) {
	            return new ErrorDataResult<List<JobAdvertisement>>("Bu id ile ilgili firma bulunamadı");
	        }
	        return new SuccessDataResult<List<JobAdvertisement>>(_jobAdvertisementDao.getAllByEmployerId(id), "Bu id'ye ait firma getirildi: " + id);
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllByCompanyName(String companyName) {
		 if (this._employerDao.findAllByCompanyName(companyName).isEmpty()) {
	            return new ErrorDataResult<List<JobAdvertisement>>("Error: Invalid Company Name!");
	        }

	        return new SuccessDataResult<List<JobAdvertisement>>
	                (_jobAdvertisementDao.getAllByEmployer_CompanyName(companyName), "Firma adına göre iş ilanları listelendi. " + companyName);
	    }
	

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		if (_checkService.nullCheckJobAdvertisement(jobAdvertisement)) {	
			return new ErrorResult("Tüm alanlar doldurulmalıdır.");
		}
		if (_checkService.checkCityExists(jobAdvertisement)) {
			return new ErrorResult("şehir mevcut değil");
		}
		if (_checkService.isEmployerExists(jobAdvertisement)) {
			return new ErrorResult("işveren mevcut değil");
		}
		_jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("İlan detayı eklendi");
	
	}

	@Override
	public Result activate(int id, boolean activationStatus) {
		 JobAdvertisement jobAdvertisementToActivate = this._jobAdvertisementDao.findById(id).orElse(null);
	        jobAdvertisementToActivate.setActivated(activationStatus);
	        this._jobAdvertisementDao.save(jobAdvertisementToActivate);
	        return new SuccessResult("Aktivasyon durumu " + Boolean.toString(activationStatus));
	}

}
