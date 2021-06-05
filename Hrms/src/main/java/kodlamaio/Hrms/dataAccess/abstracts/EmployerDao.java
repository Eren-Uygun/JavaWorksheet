package kodlamaio.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entity.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
	List<Employer> findAllByCompanyName(String companyName);
    boolean existsById(int id);

}
