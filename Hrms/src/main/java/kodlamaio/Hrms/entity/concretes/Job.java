package kodlamaio.Hrms.entity.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="jobs")
@Data
@NoArgsConstructor
public class Job {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    @ApiModelProperty(hidden = true)
    private int id;

    @Column(name="job_name")
    private String jobName;

    @OneToMany(mappedBy = "job")
    @ApiModelProperty(hidden = true)
    private List<JobAdvertisement> jobAdvertisement;

    @OneToOne(mappedBy = "job")
    @ApiModelProperty(hidden = true)
    private JobExperience jobExperince;
	


}
