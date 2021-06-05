package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.Hrms.entity.concretes.ActivationCodeEmployer;

@Repository
public interface ActivationCodeEmployerDao extends JpaRepository<ActivationCodeEmployer, Integer> {

}
