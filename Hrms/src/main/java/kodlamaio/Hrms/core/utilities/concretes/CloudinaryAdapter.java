package kodlamaio.Hrms.core.utilities.concretes;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import kodlamaio.Hrms.core.utilities.abstracts.PhotoUploadService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.core.utilities.result.ErrorDataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;

public class CloudinaryAdapter implements PhotoUploadService {
	
	private Cloudinary _cloudinary;
	
	  private Map<String, String> valuesMap = new HashMap<>();
	
  	public CloudinaryAdapter() {
		valuesMap.put("cloud_name","Input your cloud name" );
		valuesMap.put("api_key", "Input your Cloudinary api key" );
		valuesMap.put("api_secret","Input your Cloudinary secret key" );
		_cloudinary = new Cloudinary(valuesMap);
	}

	@Override
	public DataResult<Map<String, String>> upload(MultipartFile multipartFile) {
		File file;
		try {
			file = convert(multipartFile);
    		Map<String, String> result = _cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
    		file.delete();
    		return new SuccessDataResult<Map<String, String>>(result);
		} catch (IOException e) {
			e.printStackTrace();
			return new ErrorDataResult<Map<String, String>>("Dosya yüklenemedi");
		}
	}

	@Override
	public DataResult<Map> delete(String id) throws IOException {
		Map result = _cloudinary.uploader().destroy(id,ObjectUtils.emptyMap());
		return new SuccessDataResult<Map>(result);
	}
	
  	private File convert(MultipartFile multipartFile) throws IOException {
		File file = new File(multipartFile.getOriginalFilename());
		FileOutputStream stream = new FileOutputStream(file);
		stream.write(multipartFile.getBytes());
		stream.close();
		
		return file;
	}

}
