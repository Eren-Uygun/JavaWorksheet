package kodlamaIo.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIo.Hrms.business.abstracts.CandidateService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.core.utils.result.SuccessDataResult;
import kodlamaIo.Hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	private CandidateService _service;
	
	@Autowired
	public CandidatesController(CandidateService service) {
		super();
		this._service = service;
	}

	@GetMapping("/getall")
	public DataResult<List<Candidate>> getAll(){

		return _service.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Candidate candidate) {
		return _service.add(candidate);
}
		
	}
			
	
	
	
	
