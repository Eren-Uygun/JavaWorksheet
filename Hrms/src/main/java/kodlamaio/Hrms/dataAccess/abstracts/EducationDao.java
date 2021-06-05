package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Hrms.entity.concretes.Education;
import kodlamaio.Hrms.entity.dto.SortedEducationWithCandidateDto;


public interface EducationDao extends JpaRepository<Education, Integer> {
	/*
	@Query("Select new kodlamaio.northwind.entities.dto.SortedEducationWithCandidate(c.id, p.firstName,p.lastName,c.schoolName,c.finishDate) " +
            "from Education c inner join c.candidate p where c.candidate.id =: candidateId")
	    List<SortedEducationWithCandidateDto> getEducationInformation(int candidateId, Sort sort);
*/
	    List<Education> getAllByCandidateIdOrderByFinishDateDesc(int candidateId);

}
