package kodlamaIo.Hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaIo.Hrms.business.abstracts.EmployerService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.ErrorDataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.core.utils.result.SuccessDataResult;
import kodlamaIo.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaIo.Hrms.entities.concretes.Employer;
import kodlamaIo.Hrms.entities.concretes.User;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao _employerDao;
	
	public EmployerManager(EmployerDao _employerDao) {
		super();
		this._employerDao = _employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		try {
			return new DataResult<List<Employer>>(this._employerDao.findAll(), true, "İş Verenler listelendi.");
			
		} catch (Exception e) {
			return new ErrorDataResult<List<Employer>>("İş Verenler listelenemedi.");
		}
	}

	@Override
	public Result add(Employer employer) {
		try {
			return new SuccessDataResult<Employer>(this._employerDao.save(employer), "Ekleme işlemi yapıldı");
			
		} catch (Exception e) {
			return new ErrorDataResult<Employer>("Ekleme işlemi yapılamadı.");
		}
		
	}

}
