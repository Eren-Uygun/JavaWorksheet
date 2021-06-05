package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.ActivationService;
import kodlamaio.Hrms.business.abstracts.CandidateRegisterService;
import kodlamaio.Hrms.business.abstracts.CandidateService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Candidate;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {
	
	private CandidateService _candidateService;
	private CandidateRegisterService _candidateRegisterService;
	
	@Autowired
	public CandidatesController(CandidateService _candidateService,
			CandidateRegisterService _candidateRegisterService) {
		super();
		this._candidateService = _candidateService;
		this._candidateRegisterService = _candidateRegisterService;
	}

	@GetMapping("/getall")
    public DataResult<List<Candidate>> getAll(){
        return _candidateService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Candidate candidate) {
        return _candidateRegisterService.register(candidate);
    }

}
