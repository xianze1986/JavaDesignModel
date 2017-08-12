package type_01.model_01.style_02;

/**
 * 工厂方法模式--- 多个工厂方法模式
 */
public class Test {

	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produceMail();
		sender.Send();
	}
}
