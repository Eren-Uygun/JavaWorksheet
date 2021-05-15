package kodlamaIo.Hrms.adapters;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Locale;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckService {

	@Override
	public boolean checkIfRealPerson(String firstName, String lastName, String nationalIdentityNumber,
			LocalDate birthDate)  {
		
		KPSPublicSoapProxy client =  new KPSPublicSoapProxy();

		var result = true;

		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(nationalIdentityNumber),firstName.toUpperCase(new Locale("tr")), lastName.toUpperCase(new Locale("tr")), birthDate.getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		
		
	
		return result;
	}

}
