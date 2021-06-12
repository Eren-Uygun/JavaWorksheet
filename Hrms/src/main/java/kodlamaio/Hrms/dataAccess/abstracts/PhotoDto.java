package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entity.concretes.Photo;

public interface PhotoDto extends JpaRepository<Photo, Integer> {
	
	Photo getByCandidate_id(int id);
	Photo getById(int id);

}
