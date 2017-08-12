package type_01.model_02;

public class SendMailFactory implements Provider {

	public Sender produce() {
		return new MailSender();
	}

}
