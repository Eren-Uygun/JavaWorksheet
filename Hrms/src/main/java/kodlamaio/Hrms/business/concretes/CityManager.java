package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CityService;
import kodlamaio.Hrms.core.utilities.abstracts.CityCheckService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.ErrorDataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CityDao;
import kodlamaio.Hrms.entity.concretes.City;

@Service
public class CityManager implements CityService {

	private CityDao _cityDao;
	private CityCheckService _cityCheckService;
	

@Autowired
	public CityManager(CityDao _cityDao, CityCheckService _cityCheckService) {
		super();
		this._cityDao = _cityDao;
		this._cityCheckService = _cityCheckService;
	}

	@Override
	public DataResult<List<City>> getAll() {

	return new SuccessDataResult<List<City>>(this._cityDao.findAll(),"Data listelendi");
		
	}

	@Override
	public Result add(City city) {
		if (!(_cityCheckService.isCityExists(city.getCity_name()))) {
		return new SuccessDataResult<City>(_cityDao.save(city),"Şehir Eklendi");
		}
		return new ErrorDataResult<City>("Şehir eklenemedi.");
		
		
		
	}

}
