package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CityService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.CityDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.City;

@Service
public class CityManager implements CityService {
	
	private CityDao _cityDao;

	@Autowired
	public CityManager(CityDao _cityDao) {
		super();
		this._cityDao = _cityDao;
	}

	@Override
	public Result add(City city) {
		return new SuccessDataResult<City>(_cityDao.save(city), "Şehir eklendi.");
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(_cityDao.findAll(), "Şehirler listelendi.");
	}

}
