package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.EducationService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Education;
import kodlamaio.Hrms.entity.dto.SortedEducationWithCandidateDto;

@RestController
@RequestMapping("/api/educations")
public class EducationsController {
	
	private EducationService _educationService;
	
	@Autowired
	public EducationsController(EducationService educationService) {
		super();
		this._educationService = educationService;
	}

	@PostMapping("/add")
	    public Result add(@RequestBody Education education, @RequestParam int candidateId){
	        return _educationService.add(education,candidateId);
	    }
/*
	    @GetMapping("/getAllByReverseSortGraduate")
	    public DataResult<List<SortedEducationWithCandidateDto>> getAllByReverseSortGraduate(@RequestParam int candidateId){
	        return _educationService.SortedEducationWithCandidate(candidateId);
	    }
*/
}
