package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.ForeignLanguageService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/foreignLanguages/")
public class ForeignLanguagesController {
	
	private ForeignLanguageService _foreignLanguageService;

	@Autowired
	public ForeignLanguagesController(ForeignLanguageService foreignLanguageService) {
		super();
		this._foreignLanguageService = foreignLanguageService;
	}

	@PostMapping("add")
	public Result add(@RequestBody ForeignLanguage foreignLanguage) {
		return _foreignLanguageService.add(foreignLanguage);
	}

}
