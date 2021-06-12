package kodlamaio.HumanResourcesManagementSystem.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.ActivationService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;


@RestController
@CrossOrigin
@RequestMapping("/api/activations")
public class ActivationsController {
	
	private ActivationService _activationService;

	@Autowired
	public ActivationsController(ActivationService _activationService) {
		super();
		this._activationService = _activationService;
	}
	
    @PostMapping("/activationCandidateByMail")
    public Result activationCandidateByMail(@RequestParam int candidateId) throws Exception{
        return _activationService.activateCandidateAccountByEmail(candidateId);
    }

    @PostMapping("/activationEmployerByMail")
    public Result activationEmployerByMail(@RequestParam int employerId){
        return _activationService.activateEmployerAccountByEmail(employerId);
    }

    @PostMapping("/activationEmployerByEmployee")
    public Result activationEmployerByEmployee(@RequestParam int employerId,@RequestParam int employeeId){
        return _activationService.activateEmployerAccountByHrmsPersonal(employerId,employeeId);
    }
	
	
	
	

}
