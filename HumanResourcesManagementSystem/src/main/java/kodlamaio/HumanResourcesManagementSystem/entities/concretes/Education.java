package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="educations")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitae"})
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name = "field_of_study")
	private String fieldOfStudy;

	@Column(name = "degree")
	private String degree;
	
	@PastOrPresent
	@Column(name = "start_date",nullable = false)
	private LocalDate startDate;
	
	@PastOrPresent
	@Column(name = "graduate_date")
	private LocalDate graduateDate;
	
	@ManyToOne
	@JoinColumn(name = "curriculum_vitae_id")
	private CurriculumVitae curriculumVitae;

}
