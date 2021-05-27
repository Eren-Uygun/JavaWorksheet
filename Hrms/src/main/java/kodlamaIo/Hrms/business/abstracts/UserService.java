package kodlamaIo.Hrms.business.abstracts;

import java.util.List;

import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.entities.concretes.User;

public interface UserService {
	
	DataResult<List<User>> getAll();
	Result add(User user);

}
