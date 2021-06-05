package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/api/jobs")
public class JobsController {
	
	private JobService _jobService;


	@Autowired
	public JobsController(JobService jobService) {
		super();
		this._jobService = jobService;
	}
	
	 @GetMapping("/getall")
	    public DataResult<List<Job>> getAll(){
	        return _jobService.getAll();
	    }

	    @PostMapping("/add")
	    public Result add(@RequestBody Job job){
	        return _jobService.add(job);
	    }
	
	

}
