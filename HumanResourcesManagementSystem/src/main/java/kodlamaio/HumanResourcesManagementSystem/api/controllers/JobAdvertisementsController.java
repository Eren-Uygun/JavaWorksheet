package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.JobAdvertisementService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.JobAdvertisement;

@RestController
@CrossOrigin
@RequestMapping("/api/jobAdvertisements/")
public class JobAdvertisementsController {
	
	private JobAdvertisementService _jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this._jobAdvertisementService = jobAdvertisementService;
	}

	@PostMapping("add")
	public Result add(@RequestBody JobAdvertisement JobAdvertisement) {
		return _jobAdvertisementService.add(JobAdvertisement);
	}

	@PostMapping("changeStatus")
	public Result changeStatus(@RequestParam int jobPostingId) {
		return _jobAdvertisementService.changeJobAdvertisementStatus(jobPostingId);
	}

	@GetMapping("getByActive")
	public Result getByActive() {
		return _jobAdvertisementService.getByActiveJobAdvertisements();
	}

	@GetMapping("getByReleaseDate")
	public DataResult<List<JobAdvertisement>> getByReleaseDate(@RequestParam int value) {
		return _jobAdvertisementService.getByReleaseDateJobPosting(value);
	}

	@GetMapping("getByEmployer")
	public DataResult<List<JobAdvertisement>> getByEmployer(@RequestParam int employerId) {
		return _jobAdvertisementService.getByEmployerJobAdvertisement(employerId);
	}

	@GetMapping("getById")
	public Result getById(@RequestParam int id) {
		return _jobAdvertisementService.getByJobAdvertisementId(id);
	}


}
