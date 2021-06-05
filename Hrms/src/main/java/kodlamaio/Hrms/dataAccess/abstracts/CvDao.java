package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.Hrms.entity.concretes.Cv;

public interface CvDao extends JpaRepository<Cv, Integer> {

}
