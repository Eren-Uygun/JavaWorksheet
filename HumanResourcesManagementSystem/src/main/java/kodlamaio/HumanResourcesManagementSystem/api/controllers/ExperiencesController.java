package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.ExperienceService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Experience;

@RestController
@RequestMapping("/api/experiences/")
public class ExperiencesController {
	
	private ExperienceService _experienceService;

	public ExperiencesController(ExperienceService experienceService) {
		super();
		this._experienceService = experienceService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Experience experience) {
		return _experienceService.add(experience);
	}

	@GetMapping("getByDateOfFinishSorted")
	public DataResult<List<Experience>> getByDateOfFinishSorted(@RequestParam int candidateId) {
		return _experienceService.getByDateOfFinishSorted(candidateId);
	}

}
