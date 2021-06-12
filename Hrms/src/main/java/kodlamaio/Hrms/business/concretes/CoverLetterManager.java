package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CoverLetterService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CoverLetterDao;
import kodlamaio.Hrms.entity.concretes.CoverLetter;

@Service
public class CoverLetterManager implements CoverLetterService {

	private CoverLetterDao _coverLetterDao;

	@Autowired
	public CoverLetterManager(CoverLetterDao _coverLetterDao) {
		super();
		this._coverLetterDao = _coverLetterDao;
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		return new SuccessDataResult<CoverLetter>(_coverLetterDao.save(coverLetter),"Ön yazı eklendi.");
	}

	@Override
	public DataResult<CoverLetter> getById(int id) {
		
		return new SuccessDataResult<CoverLetter>(_coverLetterDao.findById(id).get(),"Önyazı getirildi");
	}

	@Override
	public DataResult<List<CoverLetter>> getAll() {
		return new SuccessDataResult<List<CoverLetter>>(_coverLetterDao.findAll(),"Tüm önyazılar getirildi.");
	}

}
