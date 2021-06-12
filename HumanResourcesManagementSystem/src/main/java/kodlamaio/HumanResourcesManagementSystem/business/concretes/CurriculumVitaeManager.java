package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.CurriculumVitaeService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.imageService.abstracts.ImageService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.imageService.adapters.ClaudinaryAdapter;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.CurriculumVitaeDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.CurriculumVitae;

@Service
public class CurriculumVitaeManager implements CurriculumVitaeService {
	
	private CurriculumVitaeDao _curriculumVitaeDao;

@Autowired
	public CurriculumVitaeManager(CurriculumVitaeDao _curriculumVitaeDao) {
		super();
		this._curriculumVitaeDao = _curriculumVitaeDao;
	}

	@Override
	public Result add(CurriculumVitae curriculumVitae) {
		return new SuccessDataResult<CurriculumVitae>(_curriculumVitaeDao.save(curriculumVitae),"Cv Eklendi.");
	}

	@Override
	public Result imageAdd(int id, MultipartFile file) {
		var result = getById(id);
		if (!result.isSuccess()) {
			return new ErrorResult(result.getMessage());
		}
		ImageService imageService = new ClaudinaryAdapter();
		Map<String, String> upload = (Map<String, String>) imageService.uploadImage(file).getData();
		result.getData().setImagePath(upload.get("url"));
		_curriculumVitaeDao.save(result.getData());
		return new SuccessResult("Resim yüklendi");
	}

	@Override
	public DataResult<List<CurriculumVitae>> getAll() {
		return new SuccessDataResult<List<CurriculumVitae>>(_curriculumVitaeDao.findAll(), "CV'ler listelendi");
	}

	@Override
	public DataResult<List<CurriculumVitae>> getByJobSeekerId(int id) {
		return new SuccessDataResult<List<CurriculumVitae>>(_curriculumVitaeDao.getByCandidate_id(id),
				"Kullanıcıya ait CV'ler listelendi");
	}

	@Override
	public DataResult<CurriculumVitae> getById(int id) {
		var result = _curriculumVitaeDao.findById(id).get();
		if (result == null) {
			return new ErrorDataResult<CurriculumVitae>("Böyle bir CV bulunamadı");
		}
		return new SuccessDataResult<CurriculumVitae>(result);
	}

}
