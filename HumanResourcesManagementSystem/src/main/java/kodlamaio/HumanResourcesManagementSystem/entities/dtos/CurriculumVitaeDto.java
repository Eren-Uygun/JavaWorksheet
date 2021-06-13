package kodlamaio.HumanResourcesManagementSystem.entities.dtos;

import java.util.List;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.CurriculumVitae;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Education;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Experience;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.ForeignLanguage;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CurriculumVitaeDto {
	
	private Candidate candidate;
	private List<Education> cvEducation;
	private List <Experience> cvExperience;
	private List<ForeignLanguage> cvLanguage;
	private List<Skill> cvSkill;
	private List<CurriculumVitae> cV;

}
