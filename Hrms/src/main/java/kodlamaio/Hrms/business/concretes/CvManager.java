package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CvService;
import kodlamaio.Hrms.business.abstracts.EducationService;
import kodlamaio.Hrms.business.abstracts.JobExperienceService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.dataAccess.abstracts.CvDao;
import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.concretes.Cv;
import kodlamaio.Hrms.entity.dto.CvDto;

@Service
public class CvManager implements CvService {
	
	private CvDao _cvDao;
	private CandidateDao _candidateDao;
	private JobExperienceService _jobExperienceService;
	private EducationService _educationService;
	
	@Autowired
	public CvManager(CvDao _cvDao, CandidateDao _candidateDao, JobExperienceService _jobExperienceService,
			EducationService _educationService) {
		super();
		this._cvDao = _cvDao;
		this._candidateDao = _candidateDao;
		this._jobExperienceService = _jobExperienceService;
		this._educationService = _educationService;
	}

	@Override
	public Result add(int candidateId, Cv cv) {
		Candidate candidate = _candidateDao.findById(candidateId).get();
        candidate.setCv(cv);
        _candidateDao.save(candidate);
        cv.setCandidate(candidate);
        _cvDao.save(cv);
        return new SuccessDataResult<Cv>(cv,"Succesfuly added CV to system.");
	}

	@Override
	public DataResult<CvDto> getByCandidate_Id(int id) {
		Candidate candidate = _candidateDao.findById(id).get();
        CvDto cvDto = new CvDto();
        cvDto.setCandidate(candidate);
        cvDto.setJobExperiences(_jobExperienceService.SortedJobExperiences(id).getData());
        cvDto.setEducations(_educationService.SortedEducation(id).getData());
        cvDto.setLanguages(candidate.getLanguage());
        return new SuccessDataResult<CvDto>(cvDto);
	}

}
