package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CityService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.City;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
	
	private CityService _cityService;

	@Autowired
	public CitiesController(CityService _cityService) {
		super();
		this._cityService = _cityService;
	}

	@GetMapping("getall")
	public DataResult<List<City>> getAll() {
		return _cityService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody City city)
	{
		return _cityService.add(city);
	}
	
	@GetMapping("getByCityId")
	public Result getByJobSeekerId(@RequestParam int getByCityId) {
		return _cityService.get(getByCityId);
	}

}
