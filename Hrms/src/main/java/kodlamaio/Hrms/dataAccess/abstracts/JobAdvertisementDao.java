package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entity.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
    List<JobAdvertisement> getAllByActivatedTrue();
    List<JobAdvertisement> getAllByActivatedTrue(Sort sort);
    List<JobAdvertisement> getAllByEmployerId(int id);
    List<JobAdvertisement> getAllByEmployer_CompanyName(String companyName);

}
