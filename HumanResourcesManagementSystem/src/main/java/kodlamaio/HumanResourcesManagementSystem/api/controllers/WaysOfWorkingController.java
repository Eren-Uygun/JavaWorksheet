package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.WayOfWorkingService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.WayOfWorking;

@RestController
@RequestMapping("/api/waysOfWorking/")
public class WaysOfWorkingController {

	private WayOfWorkingService wayOfWorkingService;

	@Autowired
	public WaysOfWorkingController(WayOfWorkingService wayOfWorkingService) {
		super();
		this.wayOfWorkingService = wayOfWorkingService;
	}

	@PostMapping("add")
	public Result add(@RequestBody WayOfWorking wayOfWorking) {
		return wayOfWorkingService.add(wayOfWorking);
	}

	@GetMapping("getAll")
	public DataResult<List<WayOfWorking>> getAll() {
		return wayOfWorkingService.getAll();
	}
}
