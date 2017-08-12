package type_01.model_01.style_01;

/**
 * 工厂方法模式--- 普通工厂方法模式
 */
public class Test {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
	}
}
