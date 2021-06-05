package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.EmployerRegisterService;
import kodlamaio.Hrms.business.abstracts.EmployerService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployersController {
	
	private EmployerService _employerService;
	private EmployerRegisterService _employerRegisterService;
	
	@Autowired
	public EmployersController(EmployerService _employerService, EmployerRegisterService _employerRegisterService) {
		super();
		this._employerService = _employerService;
		this._employerRegisterService = _employerRegisterService;
	}

	@GetMapping("/getall")
    public DataResult<List<Employer>> getAll(){
        return _employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer) {
        return _employerRegisterService.register(employer);
    }
	

}
