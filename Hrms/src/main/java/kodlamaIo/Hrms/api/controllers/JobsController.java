package kodlamaIo.Hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIo.Hrms.business.abstracts.JobService;
import kodlamaIo.Hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	private JobService _service;

	public JobsController(JobService _service) {
		super();
		this._service = _service;
	}
	
	@GetMapping("/getall")
	public List<Job> getAll(){
		return this._service.getAll();
	}

}
