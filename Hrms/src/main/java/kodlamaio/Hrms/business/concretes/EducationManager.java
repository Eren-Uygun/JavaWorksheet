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
	public DataResult<Education> add(Education education) {
        return new SuccessDataResult<Education>(_educationDao.save(education),"Succesfully education information added");
	}
	
	@Override
	public DataResult<List<Education>> SortedEducation(int candidateId) {
		return new SuccessDataResult<List<Education>>
        (this._educationDao.getAllByCandidate_idOrderByEndedDateDesc(candidateId), "Sondan başa listelendi");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(this._educationDao.findAll());
	}

	@Override
	public DataResult<Education> getById(int id) {
		return new SuccessDataResult<Education>(this._educationDao.getById(id));
	}

	@Override
	public DataResult<List<Education>> getAllByJobseekerIdOrderByEndedDateDesc(int id) {
		return new SuccessDataResult<List<Education>>(this._educationDao.getAllByCandidate_idOrderByEndedDateDesc(id));
	}

	@Override
	public DataResult<List<Education>> getAllByJobSeekerId(int id) {
		 return new SuccessDataResult<List<Education>>(this._educationDao.getAllByCandidate_id(id));
	}

}
