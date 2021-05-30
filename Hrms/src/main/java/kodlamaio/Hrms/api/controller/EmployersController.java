package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.EmployerService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Employer;

@RestController
@RequestMapping("/api/employer")
public class EmployersController {
	
	private EmployerService _employerService;

	public EmployersController(EmployerService _employerService) {
		super();
		this._employerService = _employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> employerGetAll(){
		return this._employerService.getAll();
	}
	
	@PostMapping("/register")
	public Result employerAdd(@RequestBody Employer employer) {
		return this._employerService.register(employer);
	}
	
	
	
	
	

}
