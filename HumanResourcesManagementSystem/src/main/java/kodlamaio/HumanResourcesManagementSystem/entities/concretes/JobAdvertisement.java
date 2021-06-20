package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @Column(name="description" , nullable = false)
    private String description;
    
    @Column(name = "min_salary")
    @PositiveOrZero
	private double minSalary;
	
	@Column(name = "max_salary")
	@Positive
	private double maxSalary;

	@Positive
	@Column(name = "open_position_number",nullable = false)
	private String openPositionNumber;
	
    @Column(name="release_date",nullable = false)
    @PastOrPresent
    private LocalDate releaseDate = LocalDate.now();

    @Column(name = "end_date")
    @Future
    private LocalDate endDate;
    
    @Column(name = "is_activated",nullable = false)
    private boolean isActive;
    
    @ManyToOne()
    @JoinColumn(name="job_id")
    private Job job;
    
    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;

    @ManyToOne()
    @JoinColumn(name = "employer_id")
    private Employer employer;
    
	@ManyToOne()
	@JoinColumn(name = "type_of_working_id")
	private TypeOfWorking typeOfWorking;

	@ManyToOne
	@JoinColumn(name = "way_of_working_id")
	private WayOfWorking wayOfWorking;



}
