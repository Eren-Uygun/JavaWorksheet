package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CandidateService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.dto.CvDto;



@Service
public class CandidateManager implements CandidateService {
	
	private CandidateDao _candidateDao;

	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this._candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(_candidateDao.findAll(),"İş arayan adaylar listelendi");
	}

	@Override
	public Result delete(int candidateId) {
		_candidateDao.deleteById(candidateId);
		return new SuccessResult("Kullanıcı Silindi");
	}

	@Override
	public DataResult<Candidate> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Candidate> getCandidateByNationalId(String nationalId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<CvDto> getCandidateCVById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
