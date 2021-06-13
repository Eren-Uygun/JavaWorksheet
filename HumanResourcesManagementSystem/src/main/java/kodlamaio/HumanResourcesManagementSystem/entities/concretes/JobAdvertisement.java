package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
@Table(name = "job_advertisements")
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisement"})
public class JobAdvertisement {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

	
    @ManyToOne()
    @JoinColumn(name="job_id")
    private Job job;

    @Column(name="job_info")
    private String jobInfo;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;

    @Column(name = "min_salary")
	private double minSalary;
	
	@Column(name = "max_salary")
	private double maxSalary;

	@Column(name = "open_position_number")
	private String openPositionNumber;

    @Column(name = "end_date")
    private LocalDate endDate;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;
    
	@ManyToOne()
	@JoinColumn(name = "type_of_working_id")
	private TypeOfWorking typeOfWorking;

	@ManyToOne
	@JoinColumn(name = "way_of_working_id")
	private WayOfWorking wayOfWorking;

    @Column(name="release_date")
    @ApiModelProperty(hidden = true)
    private LocalDate releaseDate = LocalDate.now();

    @Column(name = "is_activated")
    private boolean isActive;

}
