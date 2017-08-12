package type_01.model_03.style_03;

/**
 * 单例模式--类型03
 */
public class Singleton {

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}

	/* 利用一个内部类来初始化这个单例 */
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	/* 从内部类里面，获取单例 */
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}

}
