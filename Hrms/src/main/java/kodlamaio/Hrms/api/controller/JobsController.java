package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Job;

@RestController
@RequestMapping("/api/job")
public class JobsController {
	
	private JobService _jobService;

	public JobsController(JobService jobService) {
		super();
		this._jobService = jobService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Job>> jobPositionGetAll(){
		return this._jobService.getAll();
	}
	
	@PostMapping("/add")
	public Result jobPositionAdd(@RequestBody Job job) {
		return this._jobService.add(job);
	}

}
