package D4A3;

public class CheckManager implements ICheckService {

	@Override
	public boolean checkGamer(Gamer gamer) {
		
		if (!gamer.getFirstName().isEmpty() && !gamer.getLastName().isEmpty() && !gamer.getNationalIdentityNumber().isEmpty() ){
			System.out.println("Doğrulandı : "+gamer.getFirstName()+" "+gamer.getLastName()+" "+gamer.getNationalIdentityNumber());
			
			return true;
			
		}
		else {
			System.out.println("Doğrulanamadı");
				return false;
			
		}
		
	
	}

}
