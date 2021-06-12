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

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.swagger.annotations.ApiModelProperty;
import kodlamaio.HumanResourcesManagementSystem.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="curriculumvitae")
public class CurriculumVitae {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(hidden = true)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;

	@Column(name = "image_path")
	private String imagePath;

	@Column(name = "github_link")
	private String githubLink;

	@Column(name = "linkedin_link")
	private String linkedinLink;

	@Column(name = "cover_letter")
	private String coverLetter;

	@Column(name = "created_date")
	private LocalDate createdDate = LocalDate.now();

	@OneToMany(mappedBy = "curriculumVitae")
	private List<Education> educations;

	@OneToMany(mappedBy = "curriculumVitae")
	private List<Experience> experiences;

	@OneToMany(mappedBy = "curriculumVitae")
	private List<ForeignLanguage> foreignLanguages;

	@OneToMany(mappedBy = "curriculumVitae")
	private List<Skill> skills;
}
