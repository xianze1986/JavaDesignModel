package type_02.model_06.style_02;

public class Wrapper  implements Targetable {
	private Source source;
	
	public Wrapper(Source source){
		super();
		this.source = source;
	}
	@Override
	public void method1() {
		source.method1();
		
	}
	public void method2() {
		System.out.println("this is targetable method!");
	}

	

}
