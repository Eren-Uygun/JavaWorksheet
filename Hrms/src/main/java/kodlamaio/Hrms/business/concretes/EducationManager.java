package kodlamaio.Hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.EducationService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.dataAccess.abstracts.EducationDao;
import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.concretes.Education;
import kodlamaio.Hrms.entity.dto.SortedEducationWithCandidateDto;

@Service
public class EducationManager implements EducationService {
	
	private EducationDao _educationDao;
	private CandidateDao _candidateDao;

@Autowired
	public EducationManager(EducationDao _educationDao, CandidateDao _candidateDao) {
		super();
		this._educationDao = _educationDao;
		this._candidateDao = _candidateDao;
	}

	@Override
	public DataResult<Education> add(Education education, int candidateId) {
		Optional<Candidate> optional =  _candidateDao.findById(candidateId);
        education.setCandidate(optional.get());
        Candidate candidate = optional.get();
        candidate.getEducations().add(education);
        _candidateDao.save(candidate);
        _educationDao.save(education);
        return new SuccessDataResult<Education>(education,"Succesfully education information added");
	}
/*
	@Override
	public DataResult<List<SortedEducationWithCandidateDto>> SortedEducationWithCandidate(int candidateId) {
		 Sort sort = Sort.by(Sort.Direction.DESC, "finishDate");
	        return new SuccessDataResult<List<SortedEducationWithCandidateDto>>(this._educationDao.getEducationInformation(candidateId,sort),"Sondan başa göre sıralandı.");
	}*/

	@Override
	public DataResult<List<Education>> SortedEducation(int candidateId) {
		return new SuccessDataResult<List<Education>>
        (this._educationDao.getAllByCandidateIdOrderByFinishDateDesc(candidateId), "Sondan başa listelendi");
	}

}
