package kodlamaIo.Hrms.business.abstracts;

import java.util.List;

import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.entities.concretes.SystemEmployee;

public interface SysEmployerService {
	DataResult<List<SystemEmployee>> getAll();
	Result add(SystemEmployee sysEmployee);

}
