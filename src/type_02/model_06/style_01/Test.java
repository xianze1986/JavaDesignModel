package type_02.model_06.style_01;

/**
 * 适配器模式---类的适配器模式
 */
public class Test {
	public static void main(String[] args) {
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}
