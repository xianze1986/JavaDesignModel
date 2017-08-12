package type_02.model_08;

public class Proxy implements Sourceable {

	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	public void method() {
		before();
		source.method();
		after();
	}

	public void before() {
		System.out.println("before Proxy");
	}

	public void after() {
		System.out.println("before Proxy");
	}

}
