package D4A3;

public class Main {

	public static void main(String[] args) {
		
		GameManager gameManager = new GameManager();
		GamerManager gamerManager = new GamerManager(new CheckManager());
		SellManager sellManager = new SellManager();
		CampaignManager campaignManager = new CampaignManager();

		Gamer gamer = new Gamer(1, "Adam", "Black", "11111111111");
		Game game = new Game(1,"LittleMarioBros",50);
		Campaign campaign = new Campaign(1, "SummerTime Discount", 2);
		
		gamerManager.register(gamer);
		gameManager.addGame(game);
		campaignManager.addCampaign(campaign);
		campaignManager.updateCampaign(campaign, 5);
		
		
		sellManager.sellGame(game, gamer,campaign);
		
		
		

	}

}
