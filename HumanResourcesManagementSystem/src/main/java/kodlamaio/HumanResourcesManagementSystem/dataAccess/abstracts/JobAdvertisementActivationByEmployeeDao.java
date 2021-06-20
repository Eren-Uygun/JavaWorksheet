package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.JobAdvertisementActivationByEmployee;

public interface JobAdvertisementActivationByEmployeeDao extends JpaRepository<JobAdvertisementActivationByEmployee, Integer> {

}
