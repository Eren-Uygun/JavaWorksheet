package D4A3;

public class GamerManager implements IGamerService {
	ICheckService _checkService;

	public GamerManager(ICheckService _checkService) {
		super();
		this._checkService = _checkService;
	}


	@Override
	public void register(Gamer gamer) {
		if(	_checkService.checkGamer(gamer))
		{
			System.out.println("Kaydınız yapıldı. "+ gamer.getFirstName());
		}
		else {
			System.out.println("Kaydınız yapılamadı");
		}
	
		
		
	}


	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}
	
	
	


}
