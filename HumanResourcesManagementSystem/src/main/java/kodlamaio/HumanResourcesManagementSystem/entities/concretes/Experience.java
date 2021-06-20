package kodlamaio.HumanResourcesManagementSystem.entities.concretes;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cv_experiences")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "curriculumVitae" })
public class Experience {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "work_place_name", nullable = false)
	@NotNull
	@NotBlank
	private String workPlaceName;
	
	@Column(name = "position_name", nullable = false)
	@NotNull
	@NotBlank
	private String positionName;
	
	@Column(name="work_description")
	private String workDescription;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name="start_date")
	@PastOrPresent
	@CreationTimestamp 
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name="finish_date")
	@FutureOrPresent
	@CreationTimestamp     
	@Temporal(TemporalType.TIMESTAMP)
	private Date finishDate;
	
	@ManyToOne
	@JoinColumn(name = "curriculum_vitae_id")
	private CurriculumVitae curriculumVitae;

}
