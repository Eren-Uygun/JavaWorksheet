package D5A1.core.adapters.concretes;

import D5A1.core.adapters.abstracts.IAuthAdapter;
import D5A1.core.adapters.concretes.*;

public class GoogleAuthAdapter implements IAuthAdapter {
	



	@Override
	public void loginExternal(String email) {
		GoogleAuth auth = new GoogleAuth();
		auth.login(email);
	}
	
	
	
	
	

}
