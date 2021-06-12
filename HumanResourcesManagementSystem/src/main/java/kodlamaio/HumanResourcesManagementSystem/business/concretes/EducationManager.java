package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EducationService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EducationDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Education;

@Service
public class EducationManager implements EducationService {
	
	private EducationDao _educationDao;


	@Autowired
	public EducationManager(EducationDao _educationDao) {
		super();
		this._educationDao = _educationDao;
	}

	@Override
	public Result add(Education education) {
		return new SuccessDataResult<Education>(_educationDao.save(education),"Okul bilgisi eklendi.");
	}

	@Override
	public DataResult<List<Education>> getAll() {
		return new SuccessDataResult<List<Education>>(_educationDao.findAll(),"Okul listesi getirildi.");
	}

	@Override
	public DataResult<List<Education>> getByDateOfGraduationSorted(int candidateId) {
		Sort sort = Sort.by(Sort.Direction.DESC, "endDate");
		return new SuccessDataResult<List<Education>>(_educationDao.getByCurriculumVitae_Candidate_id(candidateId, sort),"Okul listesi getirildi.");
	}

}
