package kodlamaio.HumanResourcesManagementSystem.business.concretes;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.HumanResourcesManagementSystem.business.abstracts.ActivationService;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.Result;
import kodlamaio.HumanResourcesManagementSystem.core.utility.result.SuccessDataResult;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.ActivationCodeCandidateDao;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.ActivationCodeEmployerDao;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.CandidateDao;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployeeDao;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployerActivationByEmployeeDao;
import kodlamaio.HumanResourcesManagementSystem.dataAccess.abstracts.EmployerDao;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.ActivationCodeCandidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.ActivationCodeEmployer;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Candidate;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employee;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.Employer;
import kodlamaio.HumanResourcesManagementSystem.entities.concretes.EmployerActivationByEmployee;

@Service
public class ActivationManager implements ActivationService {
	
	private CandidateDao _candidateDao;
	private ActivationCodeCandidateDao _activationCodeCandidateDao;
	private ActivationCodeEmployerDao _activationCodeEmployerDao;
	private EmployerDao _employerDao;
	private EmployeeDao _employeeDao;
	private EmployerActivationByEmployeeDao _employerActivationByEmployeeDao;
	
	
	 @Autowired
	public ActivationManager(CandidateDao _candidateDao, ActivationCodeCandidateDao _activationCodeCandidateDao,
			ActivationCodeEmployerDao _activationCodeEmployerDao, EmployerDao _employerDao, EmployeeDao _employeeDao,
			EmployerActivationByEmployeeDao _employerActivationByEmployeeDao) {
		super();
		this._candidateDao = _candidateDao;
		this._activationCodeCandidateDao = _activationCodeCandidateDao;
		this._activationCodeEmployerDao = _activationCodeEmployerDao;
		this._employerDao = _employerDao;
		this._employeeDao = _employeeDao;
		this._employerActivationByEmployeeDao = _employerActivationByEmployeeDao;
	}

	@Override
	public Result activateCandidateAccountByEmail(int candidateId) {
		ActivationCodeCandidate activationCodeCandidate = new ActivationCodeCandidate();
        Candidate candidate = _candidateDao.findById(candidateId).orElse(null);
        activationCodeCandidate.setCandidate(candidate);
        activationCodeCandidate.setConfirmedDate(new Date());
        activationCodeCandidate.setConfirmed(true);
        activationCodeCandidate.setActivationCode(UUID.randomUUID().toString());
        candidate.setActivationCodeCandidate(activationCodeCandidate);
        _activationCodeCandidateDao.save(activationCodeCandidate);
        return new SuccessDataResult<Candidate>(candidate,"Have been verified by e-mail succesfuly");
	}

	@Override
	public Result activateEmployerAccountByEmail(int employerId) {
			Employer employer = _employerDao.findById(employerId).orElse(null);
	        ActivationCodeEmployer activationCodeEmployer = new ActivationCodeEmployer();
	        activationCodeEmployer.setEmployer(employer);
	        activationCodeEmployer.setConfirmedDate(new Date());
	        activationCodeEmployer.setActivationCode(UUID.randomUUID().toString());
	        activationCodeEmployer.setConfirmed(true);
	        employer.setActivationCodeEmployer(activationCodeEmployer);
	        _activationCodeEmployerDao.save(activationCodeEmployer);
	        return new SuccessDataResult<Employer>(employer,"Has been verified by e-mail succesfuly");
	}

	@Override
	public Result activateEmployerAccountByHrmsPersonal(int employerId, int employeeId) {
		 Employer employer = _employerDao.findById(employerId).orElse(null);
	        Employee employee = _employeeDao.findById(employeeId).orElse(null);
	        EmployerActivationByEmployee employerActivationByEmployee = new EmployerActivationByEmployee();
	        employerActivationByEmployee.setConfirmed(true);
	        employerActivationByEmployee.setConfirmedDate(new Date());
	        employerActivationByEmployee.setEmployee(employee);
	        employerActivationByEmployee.setEmployer(employer);
	        _employerActivationByEmployeeDao.save(employerActivationByEmployee);
	        return new SuccessDataResult<Employer>(employer,"Has been verified by hrms personal.");
	}

}
