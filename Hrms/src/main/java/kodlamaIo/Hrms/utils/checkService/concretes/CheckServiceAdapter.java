package kodlamaIo.Hrms.utils.checkService.concretes;

import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.Locale;

import kodlamaIo.Hrms.utils.checkService.abstracts.CheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CheckServiceAdapter implements CheckService {

	@Override
	public boolean checkIfRealPerson(String nationalIdentityNumber, String firstName, String lastName,
			LocalDate birthDate) {
		
		//Test edilmeyi kolaylaştırma açısından gerçek mernis sistemi proje üst seviyelere çıkana kadar devre dışı bırakılmıştır.
		//Mernis doğrulaması yapılmış olarak dönecektir.
		return true;
	}

	/*
	 * @Override public boolean checkIfRealPerson(String nationalIdentityNumber,
	 * String firstName, String lastName,
	 
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
	*/
	
	

}