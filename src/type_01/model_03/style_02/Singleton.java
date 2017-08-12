package type_01.model_03.style_02;

/**
 * 单例模式--类型02
 */
public class Singleton {

	/* 持有自己 */
	private static Singleton instance = null;

	/* 私有构造方法，防止被实例化 */
	private Singleton() {
	}

	/* 获取实例 */
	public static Singleton getInstance() {
		if (instance == null) {
			synclnit();
		}
		return instance;
	}

	/* 加同步锁，初始化实例 */
	private static synchronized void synclnit() {
		if (instance == null) {
			instance = new Singleton();
		}
	}

}
