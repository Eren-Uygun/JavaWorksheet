package kodlamaio.Hrms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.LanguageService;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	
	private LanguageService _languageService;
	
	@Autowired
	public LanguagesController(LanguageService _languageService) {
		super();
		this._languageService = _languageService;
	}

	@PostMapping("/add")
	    public Result add(@RequestBody Language language, @RequestParam int candidateId) {
	        return _languageService.add(language, candidateId);
	    }

}
