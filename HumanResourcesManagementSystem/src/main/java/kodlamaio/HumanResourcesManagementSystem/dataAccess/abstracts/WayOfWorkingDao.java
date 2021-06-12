package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.WayOfWorking;

public interface WayOfWorkingDao extends JpaRepository<WayOfWorking, Integer> {

}
