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
	@Column(name="id")
	private Integer id;
	
	@Column(name="photo_link")
	private String photoLink;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedinLink;
	
	@Column(name="description")
	private String description;

	@Column(name = "cover_letter")
	private String coverLetter;
	
	@NotNull
	@PastOrPresent
	@Column(name = "created_date",nullable = false)
	private LocalDate createdDate = LocalDate.now();
	
	
@ManyToOne
	@JoinColumn(name = "candidate_id")
	private Candidate candidate;
	@OneToMany(mappedBy = "curriculumVitae")
	private List<Education> educations;

	@OneToMany(mappedBy = "curriculumVitae")
	private List<Experience> experiences;

	@OneToMany(mappedBy = "curriculumVitae")
	private List<ForeignLanguage> foreignLanguages;

	@OneToMany(mappedBy = "curriculumVitae")
	private List<Skill> skills;
}
