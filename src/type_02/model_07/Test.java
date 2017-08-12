package type_02.model_07;

/**
 * 装饰模式
 */
public class Test {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}

}
