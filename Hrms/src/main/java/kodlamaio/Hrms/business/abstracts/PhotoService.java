package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Photo;

public interface PhotoService {
	
	    Result upload (int id,MultipartFile file);
	    DataResult<List<Photo>> getByCandidateId(int candidateId);
}
