package kodlamaio.Hrms.business.concretes;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.pattern.DateConverter;
import kodlamaio.Hrms.business.abstracts.ActivationService;
import kodlamaio.Hrms.core.utilities.result.Result;
import kodlamaio.Hrms.core.utilities.result.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.ActivationCodeCandidateDao;
import kodlamaio.Hrms.dataAccess.abstracts.ActivationCodeEmployerDao;
import kodlamaio.Hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.Hrms.dataAccess.abstracts.EmployeeDao;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerActivationByEmployeeDao;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.entity.concretes.ActivationCodeCandidate;
import kodlamaio.Hrms.entity.concretes.ActivationCodeEmployer;
import kodlamaio.Hrms.entity.concretes.Candidate;
import kodlamaio.Hrms.entity.concretes.Employee;
import kodlamaio.Hrms.entity.concretes.Employer;
import kodlamaio.Hrms.entity.concretes.EmployerActivationByEmployee;

@Service
public class ActivationManager implements ActivationService {
	
	private ActivationCodeEmployerDao _activationCodeEmployerDao;
	private ActivationCodeCandidateDao _activationCodeCandidateDao;
	private EmployerActivationByEmployeeDao _employerActivationByEmployeeDao;
	private CandidateDao _candidateDao;
	private EmployerDao _employerDao;
	private EmployeeDao _employeeDao;
	
	


@Autowired
	public ActivationManager(ActivationCodeEmployerDao _activationCodeEmployerDao,
			ActivationCodeCandidateDao _activationCodeCandidateDao,
			EmployerActivationByEmployeeDao _employerActivationByEmployeeDao, CandidateDao _candidateDao,
			EmployerDao _employerDao, EmployeeDao _employeeDao) {
		super();
		this._activationCodeEmployerDao = _activationCodeEmployerDao;
		this._activationCodeCandidateDao = _activationCodeCandidateDao;
		this._employerActivationByEmployeeDao = _employerActivationByEmployeeDao;
		this._candidateDao = _candidateDao;
		this._employerDao = _employerDao;
		this._employeeDao = _employeeDao;
	}

	@Override
	public Result activateCandidateAccountByEmail(int candidateId) {
		ActivationCodeCandidate activationCodeCandidate = new ActivationCodeCandidate();
        Candidate candidate = _candidateDao.findById(candidateId).orElse(null);
        activationCodeCandidate.setCandidate(candidate);
        activationCodeCandidate.setConfirmedDate(new Date());
        activationCodeCandidate.setConfirmed(true);
        activationCodeCandidate.setActivationCode("sampleCode");
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
        activationCodeEmployer.setActivationCode("sampleCode");
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
