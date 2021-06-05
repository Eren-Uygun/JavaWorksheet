package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.entity.concretes.Cv;
import kodlamaio.Hrms.entity.dto.CvDto;

public interface CvService {
	
	   Result add(int candidateId, Cv cv);

	    DataResult<CvDto> getByCandidate_Id(int id);

}
