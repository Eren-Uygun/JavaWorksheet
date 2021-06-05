package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService _jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService _jobAdvertisementService) {
		super();
		this._jobAdvertisementService = _jobAdvertisementService;
	}
	

    @GetMapping("/getAll")
    DataResult<List<JobAdvertisement>> getAll() {
        return this._jobAdvertisementService.getAll();
    }

    @GetMapping("/getAllSorted")
    DataResult<List<JobAdvertisement>> getAllSorted() {
        return this._jobAdvertisementService.getAllSorted();
    }

    @PostMapping("/getAllByCompanyName")
    DataResult<List<JobAdvertisement>> getAllByCompanyName(@RequestParam String companyName) {
        return this._jobAdvertisementService.getAllByCompanyName(companyName);
    }

    @PostMapping("/getAllByCompanyId")
    DataResult<List<JobAdvertisement>> getAllByCompanyId(@RequestParam int id) {
        return this._jobAdvertisementService.getAllByCompanyId(id);
    }

    @PutMapping("/activate")
    Result activate(@RequestParam("id") int id, @RequestParam("activationStatus") boolean activationStatus) {
        return this._jobAdvertisementService.activate(id, activationStatus);
    }

    @PostMapping("/add")
    Result add(@RequestBody JobAdvertisement jobAdvertisement) {
        return this._jobAdvertisementService.add(jobAdvertisement);
    }
	

}
