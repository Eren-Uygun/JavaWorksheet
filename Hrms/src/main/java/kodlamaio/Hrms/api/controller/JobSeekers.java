package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobSeekerService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.JobSeeker;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekers {
	
	private JobSeekerService _jobSeekerService;
	
	@Autowired
	public JobSeekers(JobSeekerService _jobSeekerService) {
		super();
		this._jobSeekerService = _jobSeekerService;
	}

	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> jobSeekergetAll(){
		return this._jobSeekerService.getAll();
	}
	
	@PostMapping("/register")
	public Result add(@RequestBody JobSeeker jobSeeker) {
		return this._jobSeekerService.register(jobSeeker);
	}

}
