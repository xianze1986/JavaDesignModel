package type_02.model_06.style_02;

/**
 * 适配器模式---对象的适配器模式
 */
public class Test {
	public static void main(String[] args) {
		Source source = new Source();
		Targetable target = new Wrapper(source);
		target.method1();
		target.method2();
	}
}
