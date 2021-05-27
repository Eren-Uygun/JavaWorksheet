package kodlamaIo.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIo.Hrms.business.abstracts.JobService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.entities.concretes.Candidate;
import kodlamaIo.Hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	private JobService _service;

	@Autowired
	public JobsController(JobService _service) {
		super();
		this._service = _service;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this._service.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Job job) {
		return _service.add(job);
}
		

}
