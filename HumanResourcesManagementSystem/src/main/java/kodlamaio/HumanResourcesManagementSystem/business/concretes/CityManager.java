package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CityService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.CredentialValidationService;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.CityDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.City;

@Service
public class CityManager implements CityService {
	
	private CityDao _cityDao;
	private CredentialValidationService _credentialValidation;



	public CityManager(CityDao _cityDao, CredentialValidationService _credentialValidation) {
		super();
		this._cityDao = _cityDao;
		this._credentialValidation = _credentialValidation;
	}

	@Override
	public Result add(City city) {
		return new SuccessDataResult<City>(_cityDao.save(city), "Şehir eklendi.");
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(_cityDao.findAll(), "Şehirler listelendi.");
	}

	@Override
	public DataResult<City> get(int id) {
		if (this._cityDao.findById(id).orElse(null) != null) {
			return new SuccessDataResult<City>(this._cityDao.findById(id).get(),"Şehir bulundu");
		} else {
			return new ErrorDataResult<City>("Şehir bulunamadı");
		}
	}

}
