package kodlamaio.Hrms.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.Hrms.business.abstracts.PhotoService;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.result.SuccessResult;
import kodlamaio.Hrms.entity.concretes.Photo;

@RestController
@RequestMapping("/api/photos")
public class PhotosController {
	
	private PhotoService _photoService;

	@Autowired
	public PhotosController(PhotoService _photoService) {
		super();
		this._photoService = _photoService;
	}

}
