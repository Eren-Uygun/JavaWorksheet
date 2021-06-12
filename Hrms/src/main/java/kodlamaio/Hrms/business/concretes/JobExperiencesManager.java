package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobExperienceService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.dataAccess.abstracts.JobExperienceDao;
import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.concretes.JobExperience;


@Service
public class JobExperiencesManager implements JobExperienceService {
	
	private JobExperienceDao _jobExperienceDao;
	private CandidateDao _candidateDao;
	
	@Autowired
	public JobExperiencesManager(JobExperienceDao jobExperienceDao, CandidateDao _candidateDao) {
		super();
		this._jobExperienceDao = jobExperienceDao;
		this._candidateDao = _candidateDao;
	}

	@Override
	public DataResult<JobExperience> add(JobExperience jobExperience, int candidateId) {
		 Candidate candidate = _candidateDao.findById(candidateId).get();
	        jobExperience.setCandidate(candidate);
	        candidate.getJobExperience().add(jobExperience);
	        _candidateDao.save(candidate);
	        _jobExperienceDao.save(jobExperience);
	        return new SuccessDataResult<JobExperience>(jobExperience,"Succesfully added to the system.");
	}

	@Override
	public DataResult<List<JobExperience>> SortedJobExperiences(int candidateId) {
		return new SuccessDataResult<List<JobExperience>>(_jobExperienceDao.getAllByCandidate_id(candidateId), "All educations listed with sorting descending order.");
	}

	@Override
	public DataResult<List<JobExperience>> getAll() {
		return new SuccessDataResult<List<JobExperience>>(this._jobExperienceDao.findAll());
	}

	@Override
	public DataResult<List<JobExperience>> getAllByJobSeekerId(int jobSeekerId) {
		return new SuccessDataResult<List<JobExperience>>(this._jobExperienceDao.getAllByCandidate_id(jobSeekerId));
	}

	@Override
	public DataResult<List<JobExperience>> getAllByJobSeekerIdOrderByDesc(int id) {
		return new SuccessDataResult<List<JobExperience>>(this._jobExperienceDao.getAllByCandidate_idOrderByEndedDateDesc(id));
	}

	@Override
	public DataResult<JobExperience> getById(int id) {
		return new SuccessDataResult<JobExperience>(this._jobExperienceDao.getById(id));
	}

}
