package kodlamaIo.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaIo.Hrms.business.abstracts.SysEmployerService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.ErrorDataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.core.utils.result.SuccessDataResult;
import kodlamaIo.Hrms.dataAccess.abstracts.SysEmployeeDao;
import kodlamaIo.Hrms.entities.concretes.SystemEmployee;

@Service
public class SysEmployerManager implements SysEmployerService {
	
	private SysEmployeeDao _sysEmployeeDao;


	@Autowired
	public SysEmployerManager(SysEmployeeDao _sysEmployeeDao) {
		super();
		this._sysEmployeeDao = _sysEmployeeDao;
	}

	@Override
	public DataResult<List<SystemEmployee>> getAll() {
	
		try {
			return new DataResult<List<SystemEmployee>>(_sysEmployeeDao.findAll(),true,"Sistem personeli listelendi.");
		} catch (Exception e) {
			return new ErrorDataResult<List<SystemEmployee>>("Sistem personeli listelenemedi.");
		}
	}

	@Override
	public Result add(SystemEmployee sysEmployee) {
		try {
			return new SuccessDataResult<SystemEmployee>(_sysEmployeeDao.save(sysEmployee),"Sistem Personeli eklendi");
		} catch (Exception e) {
			return new ErrorDataResult<SystemEmployee>("Sistem personeli eklenemedi.");
		}
	
	}

}
