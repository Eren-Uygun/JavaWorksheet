package kodlamaio.Hrms.entity.concretes;

import javax.persistence.Column;

public class SysEmployee extends User {
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "birth_year")
	private int birthYear;
	

}
