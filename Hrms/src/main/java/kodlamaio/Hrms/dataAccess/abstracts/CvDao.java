package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.Hrms.entity.concretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer> {
	
	Cv getById(int id);
	List<Cv> getAllByCandidate_id(int id);

}
