package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployeeService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees/")
@CrossOrigin
public class EmployeesController {
	
	private EmployeeService _employeeService;

	@Autowired
	public EmployeesController(EmployeeService employeeService) {
		super();
		this._employeeService = employeeService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Employee employee) {
		return _employeeService.add(employee);
	}

	@GetMapping("getall")
	public DataResult<List<Employee>> getAll() {
		return _employeeService.getAll();
	}

}
