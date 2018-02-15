
public class Module3_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		D e = (D)(new E());
		e.bMethod();
	}

class D implements B{
	public void bMethod() {}
}

class E extends D implements C{
	public void aMethod(){}
	public void bMethod() {}
	public void cMethod() {}
		
}
}

interface A {public void aMethod();}
interface B {public void bMethod();}
interface C extends A,B {public void cMethod();}