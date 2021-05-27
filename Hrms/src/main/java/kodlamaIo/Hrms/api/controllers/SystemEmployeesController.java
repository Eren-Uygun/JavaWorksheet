package kodlamaIo.Hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaIo.Hrms.business.abstracts.SysEmployerService;
import kodlamaIo.Hrms.core.utils.result.DataResult;
import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.dataAccess.abstracts.SysEmployeeDao;
import kodlamaIo.Hrms.entities.concretes.SystemEmployee;

@RestController
@RequestMapping("/api/sysemployee")
public class SystemEmployeesController {
	
	private SysEmployerService _sysEmployerService;

	
	public SystemEmployeesController(SysEmployerService sysEmployerService) {
		super();
		this._sysEmployerService = sysEmployerService;
	}
		
	
		@GetMapping("/getall")
		public DataResult<List<SystemEmployee>> getAll(){
		
				return _sysEmployerService.getAll();
			
		}
		
		 public Result add(SystemEmployee employee) {
			 return _sysEmployerService.add(employee);
			 
		 }
		
		
		
		
		
		
		
	}


