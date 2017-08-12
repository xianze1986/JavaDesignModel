package type_01.model_02;

public class SendSmsFactory implements Provider {

	public Sender produce() {
		return new SmsSender();
	}

}
