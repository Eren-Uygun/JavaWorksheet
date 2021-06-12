package kodlamaio.Hrms.entity.dto;

import java.util.List;

import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.concretes.Cv;
import kodlamaio.Hrms.entity.concretes.Education;
import kodlamaio.Hrms.entity.concretes.JobExperience;
import kodlamaio.Hrms.entity.concretes.Language;
import kodlamaio.Hrms.entity.concretes.Photo;
import kodlamaio.Hrms.entity.concretes.Skill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CvDto {
	
	public Candidate candidate;
	public List<Education> educations;
	public List<Skill> skills;
	public List<Cv> cV;
	public List<JobExperience> jobExperiences;
	public List<Language> languages;
	public Photo photo;
}
