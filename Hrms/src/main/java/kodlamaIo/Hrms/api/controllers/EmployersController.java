package kodlamaIo.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIo.Hrms.business.abstracts.EmployerService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaIo.Hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	
	private EmployerService _service;


	@Autowired
	public EmployersController(EmployerService employerService) {
		super();
		this._service = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		return _service.getAll();
		
	}
	
	@PostMapping("/add")
	public Result add(Employer employer){
		return _service.add(employer);
		
	}
	

	
	
	
	

}
