package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entity.concretes.EmployerActivationByEmployee;

public interface EmployerActivationByEmployeeDao extends JpaRepository<EmployerActivationByEmployee, Integer> {

}
