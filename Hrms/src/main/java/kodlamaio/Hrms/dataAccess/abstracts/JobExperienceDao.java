package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Hrms.entity.concretes.JobExperience;
import kodlamaio.Hrms.entity.dto.SortedJobExperienceWithCandidateDto;

public interface JobExperienceDao extends JpaRepository<JobExperience, Integer> {
	/*
	 @Query("Select new kodlamaio.Hrms.entity.dto.SortedJobExperienceWithCandidateDto(c.id, p.firstName,p.lastName,c.job.name,c.job.jobTitle,c.startYear,c.finishYear) " +
	            "from JobExperience c inner join c.candidate p where c.candidate.id = :candidateId")
	    List<SortedJobExperienceWithCandidateDto> getSortedJobExperienceInformation(int candidateId, Sort sort);
*/
	    List<JobExperience> getAllByCandidateIdOrderByFinishYearDesc(int candidateId);

}
