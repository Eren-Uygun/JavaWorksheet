package kodlamaio.HumanResourcesManagementSystem.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.CurriculumVitae;

public interface CurriculumVitaeService {
	
	Result add(CurriculumVitae curriculumVitae);

	Result imageAdd(int id, MultipartFile file);

	DataResult<List<CurriculumVitae>> getAll();

	DataResult<List<CurriculumVitae>> getByJobSeekerId(int id);

	DataResult<CurriculumVitae> getById(int id);
}
