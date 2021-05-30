package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CityService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CityDao;
import kodlamaio.Hrms.entity.concretes.City;

@Service
public class CityManager implements CityService {
	
private CityDao _cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this._cityDao = cityDao;
	}

	@Override
	public Result add(City city) {
		return new SuccessDataResult<City>(_cityDao.save(city), "Şehir Eklendi.");
	}

	@Override
	public DataResult<List<City>> getAll() {
		
		return new SuccessDataResult<List<City>>(_cityDao.findAll(),"Şehirler Listelendi.");
	}

	
}
