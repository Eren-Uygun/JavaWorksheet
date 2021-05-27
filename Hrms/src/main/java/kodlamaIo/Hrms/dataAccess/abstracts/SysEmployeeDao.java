package kodlamaIo.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaIo.Hrms.entities.concretes.SystemEmployee;

public interface SysEmployeeDao extends JpaRepository<SystemEmployee, Integer> {

}
