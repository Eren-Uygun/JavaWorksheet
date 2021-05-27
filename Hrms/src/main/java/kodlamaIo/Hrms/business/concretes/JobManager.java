package kodlamaIo.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaIo.Hrms.business.abstracts.JobService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.ErrorDataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.core.utils.result.SuccessDataResult;
import kodlamaIo.Hrms.dataAccess.abstracts.JobDao;
import kodlamaIo.Hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService {
	
	
	private JobDao _operation;

	/**
	 * @param _operation
	 */
	@Autowired
	public JobManager(JobDao _operation) {
		super();
		this._operation = _operation;
	}

	@Override
	public DataResult<List<Job>> getAll() {
		try {
			 return new DataResult<List<Job>>(this._operation.findAll(), true,"İş Pozsiyonları listelendi.");
		} catch (Exception e) {
			return new ErrorDataResult<List<Job>>("İş Pozisyonları listelenemedi.");
		}
	}

	@Override
	public Result add(Job job) {
		try {
			this._operation.save(job);
			return new SuccessDataResult<Job>(job, "İş pozisyonu eklendi.");
		} catch (Exception e) {
			return new ErrorDataResult<Job>("Hatalı kayıt");
		}
	

		
			}

}
