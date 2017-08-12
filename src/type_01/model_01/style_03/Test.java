package type_01.model_01.style_03;

/**
 * 工厂方法模式--- 静态工厂方法模式
 */

public class Test {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}
