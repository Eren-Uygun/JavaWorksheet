package kodlamaio.HumanResourcesManagementSystem.core.utility.result;

public class ErrorResult extends Result {
	
	public ErrorResult() { 	
		super(false);
	} 
	
	public ErrorResult(String message) {
		super(false, message);
	}
}
