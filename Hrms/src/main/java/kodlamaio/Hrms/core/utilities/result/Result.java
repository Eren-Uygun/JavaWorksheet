package kodlamaio.Hrms.core.utilities.result;

public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success = success;
	}
	
	public Result(boolean success,String message) {
    this(success); //Dry prensibine bağlı kalmak için tek paramlı Constructorda ayarlanır.
	this.message = message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
	
	public String getMessage() {
		return this.message;
	}

}