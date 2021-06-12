package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.EmployerActivationByEmployee;

public interface EmployerActivationByEmployeeDao extends JpaRepository<EmployerActivationByEmployee, Integer> {

}
