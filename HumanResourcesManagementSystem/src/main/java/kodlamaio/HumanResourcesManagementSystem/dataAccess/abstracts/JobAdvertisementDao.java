package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	@Query("From JobAdvertisement where isActive=true")
	List<JobAdvertisement> getByIsActive();
	
	JobAdvertisement getById(int id);

	List<JobAdvertisement> getByIsActive(boolean isActive);

	List<JobAdvertisement> getByIsActive(boolean isActive, Sort sort);

	List<JobAdvertisement> getByIsActiveAndEmployer_id(boolean isActive, int id);

}
