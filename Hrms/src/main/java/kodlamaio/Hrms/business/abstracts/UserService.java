package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.entity.concretes.User;

public interface UserService {
	public DataResult<List<User>> getAll();

}
