package kodlamaio.HumanResourcesManagementSystem.core.utility.validation.adapters;

import kodlamaio.HumanResourcesManagementSystem.core.utility.validation.abstracts.PersonValidationService;

public class MernisValidationAdapter implements PersonValidationService {

	@Override
	public boolean CheckIfRealPerson(String firstName, String lastName, int birthYear, String nationalIdentityNumber) {
		//  Bu bölüm simule edilecek.
		return true;
	}

}
