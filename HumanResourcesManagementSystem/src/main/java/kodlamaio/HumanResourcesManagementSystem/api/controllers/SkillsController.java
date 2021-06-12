package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.SkillService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Skill;

@RestController
@RequestMapping("/api/skills/")
public class SkillsController {
	
	private SkillService _skillService;

	@Autowired
	public SkillsController(SkillService skillService) {
		super();
		this._skillService = skillService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Skill skill) {
		return _skillService.add(skill);
	}

}
