package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entity.concretes.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {
	Language getById(int id);
	List<Language> getAllByCandidate_id(int id);
}
