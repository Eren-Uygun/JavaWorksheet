package kodlamaIo.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "employers")
public class Employer {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "website")
	private String webSite;
	@Column(name = "tax_number")
	private String taxNumber;
	@Column(name = "phone_number")
	private String phoneNumber;
	
	public Employer() {
		
	}
	
	public Employer(int id, String companyName, String webSite, String taxNumber, String phoneNumber) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webSite = webSite;
		this.taxNumber = taxNumber;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
