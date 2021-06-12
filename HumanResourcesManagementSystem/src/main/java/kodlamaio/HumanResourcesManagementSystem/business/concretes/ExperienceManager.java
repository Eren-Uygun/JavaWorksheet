package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.ExperienceService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.ExperienceDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Experience;

@Service
public class ExperienceManager implements ExperienceService {

	private ExperienceDao _experienceDao;

	@Autowired
	public ExperienceManager(ExperienceDao _experienceDao) {
		super();
		this._experienceDao = _experienceDao;
	}

	@Override
	public Result add(Experience cvExperience) {
		return new SuccessDataResult<Experience>(_experienceDao.save(cvExperience), "İş tecrübesi eklendi.");
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		return new SuccessDataResult<List<Experience>>(_experienceDao.findAll(), "İş tecrübeleri listelendi.");
	}

	@Override
	public DataResult<List<Experience>> getByDateOfFinishSorted(int candidateId) {
		Sort sort = Sort.by(Sort.Direction.DESC, "endDate");
		return new SuccessDataResult<List<Experience>>(
				_experienceDao.getByCurriculumVitae_Candidate_id(candidateId, sort));
	}
}
