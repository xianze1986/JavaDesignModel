package type_02.model_10;

/**
 * 桥接模式
 */
public class Test {
	public static void main(String[] args) {
		Bridge bridge = new MyBridge();

		/* 调用第一个对象 */
		SourceSub1 source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();

		/* 调用第二个对象 */
		SourceSub2 source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
	}
}
