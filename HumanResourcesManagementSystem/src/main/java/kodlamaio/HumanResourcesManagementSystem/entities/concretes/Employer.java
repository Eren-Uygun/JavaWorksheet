package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;
import kodlamaio.HumanResourcesManagementSystem.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name = "employers")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","activationCodeEmployer","employerActivationByEmployee","jobAdvertisement"})

public class Employer extends User {
	
	@NotBlank
	@NotNull
    @Column(name = "company_name")
    private String companyName;

	@NotBlank
	@NotNull
    @Column(name = "website_address")
    private String webSite;

	@NotBlank
	@NotNull
    @Column(name= "phone_number")
    private String telephoneNumber;
	
	@OneToMany(mappedBy = "employer")
	@JsonIgnore
	private List<JobAdvertisement> jobAdvertisement;
	
    @OneToOne(mappedBy = "employer")
    @JsonIgnore
    private ActivationCodeEmployer activationCodeEmployer;

    @OneToOne(mappedBy = "employer")
    @JsonIgnore
    private EmployerActivationByEmployee employerActivationByEmployee;
    
    
}
