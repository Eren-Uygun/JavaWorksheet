package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.CityService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.City;


@RestController
@RequestMapping("/api/city")
public class CitiesController {
	
	private CityService _service;
	
	
	
	public CitiesController(CityService _service) {
		super();
		this._service = _service;
	}

	@GetMapping("/getall")
	public DataResult<List<City>> cityGetAll(){
		return this._service.getAll();
	}
	
	@PostMapping("/add")
	public Result cityAdd(@RequestBody City city) {
		return this._service.add(city);
	}

}
