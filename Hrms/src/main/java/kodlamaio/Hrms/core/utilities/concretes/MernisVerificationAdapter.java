package kodlamaio.Hrms.core.utilities.concretes;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.abstracts.MernisVerificiationService;
import kodlamaio.Hrms.entity.concretes.Candidate;

@Service
public class MernisVerificationAdapter implements MernisVerificiationService {

	//Simule Edilecektir.
	
	@Override
	public boolean mernisVerification(Candidate candidate) {
		return true;
	}



}
