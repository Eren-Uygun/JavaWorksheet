package kodlamaio.Hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.UserService;
import kodlamaio.Hrms.core.utilities.result.DataResult;
import kodlamaio.Hrms.entity.concretes.User;

@RestController
@RequestMapping("/api/user")
public class UsersController {
	
	private UserService _userService;

	@Autowired
	public UsersController(UserService _userService) {
		super();
		this._userService = _userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getall(){
		return _userService.getAll();
	}
	
	
	

}
