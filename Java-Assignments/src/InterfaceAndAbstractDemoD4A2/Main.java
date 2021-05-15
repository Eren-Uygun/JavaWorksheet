package InterfaceAndAbstractDemoD4A2;

import java.time.LocalDate;

/*Senaryomuz: Kahve dükkanları için müşteri yönetim sistemi(cms) yapan bir sistem yazmak istiyoruz.
 * 
 * Starbucks ve nero için çalıştığımızı varsayalım.
 * İki firma da müşterileri veri tabanına kaydetmek istiyor.
 * Starbucks müşterileri kaydederken , mutlaka mernis doğrulaması istiyor.
 * Nero böyle bi doğrulamaya ihtiyaç duymadan kaydediyor.
 * Starbucks her kahve alımında müşterilere yıldız kazandırmak istiyor.
 * 
 * 
 * 
 * */

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		//Buraya kimlik bilgilerinizi girerek sistemi çalışır hale getirebilirsiniz.
		baseCustomerManager.save(new Customer(1,"Test","test","00000000000",LocalDate.of(1995, 1, 1)));
		
		
		
		
		
	
		

	}

}
