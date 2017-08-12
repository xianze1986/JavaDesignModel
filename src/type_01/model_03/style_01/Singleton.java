package type_01.model_03.style_01;

/**
 * 单例模式--类型01
 */
public class Singleton {

	/* 持有自己 */
	private static Singleton instance = null;

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}

	/* 对外提供一个获取实例的方法 */
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
