package kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HumanResourcesManagementSystem.entities.concretes.TypeOfWorking;

public interface TypeOfWorkingDao extends JpaRepository<TypeOfWorking, Integer> {

}
