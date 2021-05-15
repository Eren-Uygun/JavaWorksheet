package D4A3;

public class Gamer implements IEntity {
private	int id;
private	String firstName;
private	String lastName;
private	String NationalIdentityNumber;

	public Gamer(int id, String firstName, String lastName, String nationalIdentityNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		NationalIdentityNumber = nationalIdentityNumber;
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

	public String getNationalIdentityNumber() {
		return NationalIdentityNumber;
	}

	public void setNationalIdentityNumber(String nationalIdentityNumber) {
		NationalIdentityNumber = nationalIdentityNumber;
	}

}
