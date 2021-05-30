package kodlamaio.Hrms.core.utilities.abstracts;

import java.util.List;

public interface EmailCheckService {
	
	public List<String> emailCheckOnDb();
	public boolean emailIsItUsed(String email);

}
