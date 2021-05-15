package InterfaceAndAbstractDemoD4A2;

import java.time.LocalDate;




public class Customer implements IEntity {

	private int id;
	private String firstName;
	private String lastName;
	private String nationalIdentityNumber;
	private LocalDate birthDate;
	
	public Customer(int id, String firstName, String lastName, String nationalIdentityNumber, LocalDate dateOfBirth) {
		this.birthDate = dateOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.nationalIdentityNumber = nationalIdentityNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getnationalIdentityNumber() {
		return nationalIdentityNumber;
	}
	public void setnationalIdentityNumber(String identityNumber) {
		this.nationalIdentityNumber = identityNumber;
	}
	public LocalDate getbirthDate() {
		return birthDate;
	}
	public void setbirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


}
