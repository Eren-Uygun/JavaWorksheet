package D5A1.entities.concretes;

import D5A1.entities.abstracts.IDto;

public class LoginDto implements IDto {
	
	String email;
	String password;
	
	public LoginDto() {
		
	}

	public LoginDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
