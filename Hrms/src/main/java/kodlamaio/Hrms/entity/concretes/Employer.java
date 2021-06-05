package kodlamaio.Hrms.entity.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import kodlamaio.Hrms.entity.abstracts.User;
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
	
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "website_address")
    private String webSite;

    @Column(name= "phone_number")
    private String telephoneNumber;

    @OneToOne(mappedBy = "employer")
    @ApiModelProperty(hidden = true)
    private ActivationCodeEmployer activationCodeEmployer;

    @OneToOne(mappedBy = "employer")
    @ApiModelProperty(hidden = true)
    private EmployerActivationByEmployee employerActivationByEmployee;

    @OneToMany(mappedBy="employer")
    @ApiModelProperty(hidden = true)
    private List<JobAdvertisement> jobAdvertisement;
	

}
