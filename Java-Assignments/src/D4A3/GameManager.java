package D4A3;

import java.util.List;

public class GameManager implements IGameService {

	@Override
	public void addGame(Game game) {
		System.out.println("Oyun eklendi. "+game.getName()+" "+game.getPrice()+"$'dan satışa sunuldu. İndirim oranı satışda eklenecektir.");
		
	}

	@Override
	public void removeGame(Game game) {
		System.out.println("Oyun silindi."+game.getName());
		
	}

	@Override
	public void updateGame(Game game) {
		// TODO Auto-generated method stub
		
	}


}
