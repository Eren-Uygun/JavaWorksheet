package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.Hrms.business.abstracts.PhotoService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.ErrorDataResult;
import kodlamaio.Hrms.core.utilities.result.ErrorResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.PhotoDao;
import kodlamaio.Hrms.entity.concretes.Photo;

@Service
public class PhotoManager implements PhotoService {

	private PhotoDao _photoDao;

	@Autowired
	public PhotoManager(PhotoDao _photoDao) {
		super();
		this._photoDao = _photoDao;
	}

	@Override
	public Result upload (int id,MultipartFile file) {
		return null;

	}

	@Override
	public DataResult<List<Photo>> getByCandidateId(int candidateId) {
		
		var result =  _photoDao.getById(candidateId);
		if(result != null) {
			return new SuccessDataResult(result,"Id'ye ait resimler getirildi.");
		}
		return new ErrorDataResult<List<Photo>>();
	}

}
