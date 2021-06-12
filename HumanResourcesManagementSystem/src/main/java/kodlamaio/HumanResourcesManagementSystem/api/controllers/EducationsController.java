package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Education;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EducationService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;

@RestController
@RequestMapping("/api/educations/")
public class EducationsController {
	
	private EducationService _educationService;


	@Autowired
	public EducationsController(EducationService _educationService) {
		super();
		this._educationService = _educationService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Education Education) {
		return _educationService.add(Education);
	}

	@GetMapping("getByDateOfGraduationSorted")
	public DataResult<List<Education>> getByDateOfGraduationSorted(@RequestParam int candidateId) {
		return _educationService.getByDateOfGraduationSorted(candidateId);
	}

}
