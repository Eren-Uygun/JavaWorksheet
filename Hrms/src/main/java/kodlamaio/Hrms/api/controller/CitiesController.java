package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.CityService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.City;

@RestController
@RequestMapping("/api/cities/")
public class CitiesController {
	
	private CityService _cityService;


	@Autowired
	public CitiesController(CityService _cityService) {
		super();
		this._cityService = _cityService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<City>> getAll(){
		return this._cityService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(City city) {
		return _cityService.add(city);
	}
	
	
	
	

}
