package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CurriculumVitaeService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.CurriculumVitae;

@RestController
@RequestMapping("/api/curriculumvitaes/")
public class CurriculumVitaesController {
	
	private CurriculumVitaeService _curriculumVitaeService;

	@Autowired
	public CurriculumVitaesController(CurriculumVitaeService curriculumVitaeService) {
		super();
		this._curriculumVitaeService = curriculumVitaeService;
	}

	@PostMapping("add")
	public Result add(@RequestBody CurriculumVitae curriculumVitae) {
		return _curriculumVitaeService.add(curriculumVitae);
	}

	@PostMapping("imageAdd")
	public Result imageAdd(@RequestParam int curriculumVitaeId, @RequestParam MultipartFile file) {
		return _curriculumVitaeService.imageAdd(curriculumVitaeId, file);
	}

	@GetMapping("getAll")
	public Result getAll() {
		return _curriculumVitaeService.getAll();
	}

	@GetMapping("getByJobSeekerId")
	public Result getByJobSeekerId(@RequestParam int getByJobSeekerId) {
		return _curriculumVitaeService.getByJobSeekerId(getByJobSeekerId);
	}

}
