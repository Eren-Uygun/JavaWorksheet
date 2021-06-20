package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisement_activation_by_employees")
public class JobAdvertisementActivationByEmployee {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    private int id;
    
    @OneToOne
    @JoinColumn(name = "job_advertisement_id")
    private JobAdvertisement jobAdvertisement;
    
    @Column(name = "is_job_advertisement_confirm")
    private boolean isJobConfirm;
    
	@OneToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;
}
