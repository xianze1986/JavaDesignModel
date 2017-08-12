package type_01.model_05.style_01;

/**
 * 原型模式---浅复制
 */
public class Prototype implements Cloneable {

	/* 提供一个复制当前实例的方法 */
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}
}
