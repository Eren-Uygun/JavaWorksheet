package kodlamaio.HumanResourcesManagementSystem.core.utility.imageService.adapters;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.HumanResourcesManagementSystem.core.utility.imageService.abstracts.ImageService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.ErrorDataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;

public class ClaudinaryAdapter implements ImageService {
	
	Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap("cloud_name", "hp-cloud", "api_key", "355191883437474",
			"api_secret", "4AXz6oRnGKCKqrLTUtxrkMzyEv8"));

	@Override
	public DataResult<?> uploadImage(MultipartFile file) {
		try {
			Map upload = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
			return new SuccessDataResult<Map>(upload);
		} catch (IOException e) {
			e.printStackTrace();
			return new ErrorDataResult<Map>();
		}
	}

}
