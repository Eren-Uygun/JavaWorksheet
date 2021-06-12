package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entity.concretes.Skill;

public interface SkillDto extends JpaRepository<Skill, Integer> {
	
	Skill getById(int id);
	List<Skill> getAllByCandidate_id(int id);

}
