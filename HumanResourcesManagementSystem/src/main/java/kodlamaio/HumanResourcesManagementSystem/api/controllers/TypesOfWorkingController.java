package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.TypeOfWorkingService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.TypeOfWorking;

@RestController
@RequestMapping("/api/typesOfWorking/")
public class TypesOfWorkingController {

	private TypeOfWorkingService _typeOfWorkingService;

	@Autowired
	public TypesOfWorkingController(TypeOfWorkingService typeOfWorkingService) {
		super();
		this._typeOfWorkingService = typeOfWorkingService;
	}

	@PostMapping("add")
	public Result add(@RequestBody TypeOfWorking typeOfWorking) {
		return _typeOfWorkingService.add(typeOfWorking);
	}

	@GetMapping("getAll")
	public DataResult<List<TypeOfWorking>> getAll() {
		return _typeOfWorkingService.getAll();
	}
	
	
}
