package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.JobService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs/")
public class JobsController {

	private JobService _jobService;

	@Autowired
	public JobsController(JobService jobService) {
		super();
		this._jobService = jobService;
	}

	@PostMapping("add")
	public Result add(@RequestBody Job job) {
		return _jobService.add(job);
	}

	@GetMapping("getall")
	public DataResult<List<Job>> getAll() {
		return _jobService.getAll();
	}
	
}
