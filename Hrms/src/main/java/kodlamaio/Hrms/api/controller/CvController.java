package kodlamaio.Hrms.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.CvService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.entity.concretes.Cv;
import kodlamaio.Hrms.entity.dto.CvDto;

@RestController
@RequestMapping("api/cv")
public class CvController {
	
	private CvService _cvService;
	
	@PostMapping("/add")
    public Result add(@RequestParam int candidateId, @RequestBody Cv cv){
        return _cvService.add(candidateId, cv);
    }

    @GetMapping("/getByCandidateId")
    public DataResult<CvDto> getByCandidateId(@RequestParam int candidateId){
        return _cvService.getByCandidate_Id(candidateId);
    }

}
