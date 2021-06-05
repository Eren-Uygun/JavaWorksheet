package kodlamaio.Hrms.core.utilities.abstracts;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.Hrms.core.utilities.result.DataResult;

public interface PhotoUploadService {
	
	DataResult<Map<String, String>> upload(MultipartFile file);
	DataResult<Map> delete(String id) throws IOException;
	
}
