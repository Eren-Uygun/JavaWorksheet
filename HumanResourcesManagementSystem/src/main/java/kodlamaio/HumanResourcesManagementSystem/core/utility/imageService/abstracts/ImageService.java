package kodlamaio.HumanResourcesManagementSystem.core.utility.imageService.abstracts;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;

public interface ImageService {
	
	DataResult<?> uploadImage(MultipartFile file);

}
