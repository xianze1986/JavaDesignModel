package type_01.model_04;

/**
 * 建造者模式
 */
public class Test {

	public static void main(String[] args) {
		Builder builder = new Builder();
		builder.produceMailSender(10);

	}

}
