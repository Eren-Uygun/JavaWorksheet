package kodlamaIo.Hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "activations")
public class Activation {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "activation_number")
	private String activationNumber;
	
	@Column(name = "activation_date")
	private LocalDate activationDate;
	
	@Column(name = "is_confirmed")
	private boolean isActivated;
	
	public Activation() {
		
	}
	
	public Activation(int id, int userId, String activationNumber, LocalDate activationDate, boolean isActivated) {
		super();
		this.id = id;
		this.userId = userId;
		this.activationNumber = activationNumber;
		this.activationDate = activationDate;
		this.isActivated = isActivated;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getActivationNumber() {
		return activationNumber;
	}

	public void setActivationNumber(String activationNumber) {
		this.activationNumber = activationNumber;
	}

	public LocalDate getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(LocalDate activationDate) {
		this.activationDate = activationDate;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}
	

}
