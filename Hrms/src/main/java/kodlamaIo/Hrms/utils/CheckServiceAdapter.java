package kodlamaIo.Hrms.utils;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Locale;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckServiceAdapter implements CheckService {

	@Override
	public boolean checkIfRealPerson(String nationalIdentityNumber, String firstName, String lastName,
			LocalDate birthDate) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean result = true;
		
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(nationalIdentityNumber), firstName.toUpperCase(new Locale("tr")), lastName.toUpperCase(new Locale("tr")), birthDate.getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

}
