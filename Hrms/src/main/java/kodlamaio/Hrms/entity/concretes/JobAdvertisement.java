package kodlamaio.Hrms.entity.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisement")
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class JobAdvertisement {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty(hidden = true)
    private int id;

    @ManyToOne()
    @JoinColumn(name="position_id")
    private Job job;

    @Column(name="job_info")
    private String jobInfo;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City cities;

    @Column(name = "min_wage")
    private int min_wage;

    @Column(name = "max_wage")
    private int max_wage;

    @Column(name = "num_of_position")
    private int num_of_position;

    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;

    @CreationTimestamp
    @Column(name="release_date", updatable = false)
    @ApiModelProperty(hidden = true)
    private Date releaseDate;


    @Column(name = "is_activated")
    private boolean activated;
	
	

}
