package kodlamaIo.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIo.Hrms.business.abstracts.UserService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.entities.concretes.User;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService _userService;

	
	@Autowired
	public UsersController(UserService _userService) {
		super();
		this._userService = _userService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<User>> getAll(){
		
		return _userService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(User user) {
		return _userService.add(user);
		
	}
	
	
	
	

}
