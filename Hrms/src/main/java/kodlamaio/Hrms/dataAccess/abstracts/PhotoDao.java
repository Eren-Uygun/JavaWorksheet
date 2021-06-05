package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entity.concretes.Photo;

public interface PhotoDao extends JpaRepository<Photo, Integer> {
	
	List<Photo> getByCandidateId(int candidateId);
	Photo getById(int photoId);

}
