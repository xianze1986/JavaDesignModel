package type_01.model_01.style_01;

public class SendFactory {
	public Sender produce(String type) {
		if (type.equals("mail")) {
			return new MailSender();
		} else if (type.equals("sms")) {
			return new SmsSender();
		} else {
			return null;
		}
	}
}
