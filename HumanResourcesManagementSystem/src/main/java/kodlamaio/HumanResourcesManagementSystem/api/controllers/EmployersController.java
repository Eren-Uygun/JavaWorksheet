package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployerService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employer;

@RestController
@CrossOrigin
@RequestMapping("/api/employers/")
public class EmployersController {
	
	private EmployerService _employerService;
	
	@GetMapping("getall")
	public DataResult<List<Employer>> getAll() {
		return _employerService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Employer employer)
	{
		return _employerService.add(employer);
	}

}
