package D4A3;

public class SellManager implements ISellService {

	@Override
	public void sellGame(Game game, Gamer gamer,Campaign campaign) {
		
		System.out.println(game.getName()+" Adlı oyun "+(game.getPrice()/campaign.discountRate)+"$'dan " + gamer.getFirstName()+" adlı kullanıcıya satılmıştır.");
	}


}
