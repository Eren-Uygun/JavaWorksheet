package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HumanResourcesManagementSystem.business.abstracts.EmployeeService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.DataResult;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployeeDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService
{
	private EmployeeDao _employeeDao;
	
	@Autowired
	public EmployeeManager(EmployeeDao _employeeDao) {
		super();
		this._employeeDao = _employeeDao;
	}

	@Override
	public Result add(Employee employee) {
		return new SuccessDataResult<Employee>(_employeeDao.save(employee), "Sistem personeli eklendi");
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>(_employeeDao.findAll(), "Sistem personel listesi getirildi.");
	}

}
