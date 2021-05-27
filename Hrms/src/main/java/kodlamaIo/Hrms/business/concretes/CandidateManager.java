package kodlamaIo.Hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaIo.Hrms.business.abstracts.CandidateService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.ErrorDataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.core.utils.result.SuccessDataResult;
import kodlamaIo.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaIo.Hrms.entities.concretes.Candidate;
import kodlamaIo.Hrms.entities.concretes.Employer;
import kodlamaIo.Hrms.entities.concretes.Job;

@Service
public class CandidateManager implements CandidateService {

	private CandidateDao _candidateDao;
	
	public CandidateManager(CandidateDao _candidateDao) {
		super();
		this._candidateDao = _candidateDao;
	}
	
	
	@Override
	public DataResult<List<Candidate>> getAll() {
		try {
			return new DataResult<List<Candidate>>(this._candidateDao.findAll(), true,"İş Arayanlar listelendi.");
		} catch (Exception e) {
			return new ErrorDataResult<List<Candidate>>("İş Arayanlar listelenemedi.");
		}
		
	}

	@Override
	public Result add(Candidate candidate) {
		try {
		
			return new SuccessDataResult<Candidate>(this._candidateDao.save(candidate), "Ekleme işlemi yapıldı");
			
		} catch (Exception e) {
			return new ErrorDataResult<Candidate>("Ekleme işlemi yapılamadı.");
		}
}
}
