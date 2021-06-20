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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="skills")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","curriculumVitae"})
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "skill_name")
	private String skillName;
	
	@Column(name = "added_date", nullable = false)
	@NotNull
	@PastOrPresent
	private LocalDate addedDate = LocalDate.now();
	
	@ManyToOne
	@JoinColumn(name = "curriculum_vitae_id")
	private CurriculumVitae curriculumVitae;

}
