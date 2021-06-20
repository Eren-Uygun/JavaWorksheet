package kodlamaio.HumanResourcesManagementSystem.core.utility.generateOp;

import java.util.UUID;

public class externalUtility {
	
	public static String generateActivationCode() {
		UUID randomActivationCode = UUID.randomUUID();
		String activationNumber = randomActivationCode.toString();
		return activationNumber;
	}

}
