package kodlamaio.Hrms.core.utilities.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.abstracts.CityCheckService;
import kodlamaio.Hrms.dataAccess.abstracts.CityDao;
import kodlamaio.Hrms.entity.concretes.City;

@Service
public class CityCheckManager  implements CityCheckService{
	
	 private CityDao _cityDao;
	 
	 @Autowired
	    public CityCheckManager(CityDao _cityDao) {
	        this._cityDao = _cityDao;
	    }
	 
	 
	@Override
	public boolean isCityExists(String cityName) {
		 List<City> cityList = _cityDao.findAll();
	        for (City checkCity : cityList) {
	            if (checkCity.getCity_name() == cityName) {
	                return true;
	            }
	        }
	        return false;
	}

}
