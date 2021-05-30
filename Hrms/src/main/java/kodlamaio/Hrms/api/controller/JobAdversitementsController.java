package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdversitementsController {
	
	private JobAdvertisementService _jobAdvertisementService;
	
	

	public JobAdversitementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this._jobAdvertisementService = jobAdvertisementService;
	}

	@GetMapping("/GetAll")
	public DataResult<List<JobAdvertisement>> jobAdvertisementGetAll(){
		return this._jobAdvertisementService.getAll();
	}
	
	@GetMapping("/GetAllActive")
	public DataResult<List<JobAdvertisement>> jobAdvertisementGetAllActiv(){
		return this._jobAdvertisementService.getByIsActive();
	}
	
	@PostMapping("/add")
	public Result jobAdvertisementAdd(@RequestBody JobAdvertisement jobAdvertisement) {
		return this._jobAdvertisementService.add(jobAdvertisement);
	}
	@GetMapping("/GetAllSortedByDeadline")
	public DataResult<List<JobAdvertisement>> getAllSortedByDeadline(){
		return this._jobAdvertisementService.getAllSortedByDeadline();
	}
	
	@GetMapping("/BycompanyNameAndIsActive")
	public DataResult<List<JobAdvertisement>> getBycompanyNameAndIsActive(@RequestParam("companyName") String companyName){
		return this._jobAdvertisementService.getByEmployer_CompanyNameAndIsActive(companyName);
	}
	
	@PostMapping("IsActive")
	public Result update(int id , boolean isActive) {
		return this._jobAdvertisementService.update(id, isActive);
	}
}
