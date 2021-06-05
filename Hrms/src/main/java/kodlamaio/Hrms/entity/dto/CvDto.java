package kodlamaio.Hrms.entity.dto;

import java.util.List;

import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.concretes.Education;
import kodlamaio.Hrms.entity.concretes.JobExperience;
import kodlamaio.Hrms.entity.concretes.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CvDto {
	
    private Candidate candidate;
    private String description;
    private String githubAddress;
    private String linkedinAddress;
    private String technologies;
    private String coverLetter;
    private List<Education> educationList;
    private List<JobExperience> jobExperiences;
    private List<Language> languageList;
}
