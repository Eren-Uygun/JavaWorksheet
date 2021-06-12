package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import kodlamaio.HumanResourcesManagementSystem.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "candidates")
public class Candidate extends User {
	
	@NotBlank
	@NotNull
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank
	@NotNull
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank
	@NotNull
	@Column(name = "national_identity_number")
	private String nationalIdentityNumber;
	
	@NotBlank
	@NotNull
	@Column(name = "birthdate")
	private LocalDate birthDate;
	
    @OneToOne(mappedBy = "candidate",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonIgnore()
    private ActivationCodeCandidate activationCodeCandidate;

}
