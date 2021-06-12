package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CandidateService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;

@RestController
@CrossOrigin
@RequestMapping("/api/candidates/")
public class CandidatesController {
	
	private CandidateService _candidateService;

	@Autowired
	public CandidatesController(CandidateService _candidateService) {
		super();
		this._candidateService = _candidateService;
	}
	
	@GetMapping("getall")
	public DataResult<List<Candidate>> getAll() {
		return _candidateService.getAll();
	}
	
	@PostMapping("add")
	public Result add(@RequestBody Candidate candidate)
	{
		return _candidateService.add(candidate);
	}
	
	
	
	

}
