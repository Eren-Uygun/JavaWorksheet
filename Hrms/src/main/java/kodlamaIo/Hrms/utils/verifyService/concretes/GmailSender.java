package kodlamaIo.Hrms.utils.verifyService.concretes;

import kodlamaIo.Hrms.core.utils.result.Result;
import kodlamaIo.Hrms.utils.verifyService.abstracts.MailSenderService;

public class GmailSender implements MailSenderService {

	@Override
	public String sendMail(String message, String title, String email) {
		
		if (email.endsWith("@gmail.com")) {
			return "VerificationCode "+title+message;
		}
		else {
			return "Hatalı İşlem";
		}
		
	}


}
