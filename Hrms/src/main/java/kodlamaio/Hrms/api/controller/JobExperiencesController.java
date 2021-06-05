package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobExperienceService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.JobExperience;
import kodlamaio.Hrms.entity.dto.SortedJobExperienceWithCandidateDto;

@RestController
@RequestMapping("/api/jobExperiences")
public class JobExperiencesController {
	
	private JobExperienceService _jobExperienceService;
	
	@Autowired
	public JobExperiencesController(JobExperienceService jobExperienceService) {
		super();
		this._jobExperienceService = jobExperienceService;
	}

	@PostMapping("/add")
    public Result add(@RequestBody JobExperience jobExperience, @RequestParam int candidateId){
        return _jobExperienceService.add(jobExperience,candidateId);
    }
/*
    @GetMapping("/getAllByReverseSortJobExperience")
    public DataResult<List<SortedJobExperienceWithCandidateDto>> getAllByReverseSortGraduate(@RequestParam int candidateId){
        return _jobExperienceService.SortedJobExperiencesWithCandidate(candidateId);
    }
    */

}
