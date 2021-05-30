package kodlamaio.Hrms.entity.concretes;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "job_advertisement")
@EqualsAndHashCode(callSuper=false)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","JobAdvertisement"})
public class JobAdvertisement extends Job {
	/*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	*/
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "number_of_open_positions")
	private int numberOfOpenPosition;
	
	@Column(name = "deadline")
	private LocalDate deadlineDate;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "release_date")
	private LocalDate releaseDate;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employer employer;
	

	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	
	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job jobPosition;

}
