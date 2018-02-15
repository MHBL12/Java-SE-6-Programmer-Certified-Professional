
public class Module2_12 {

	
	class A implements Foo{
		public int bar() {return 1;}	
	}
	
	
	public int fubar(Foo foo) {return foo.bar();}
	
	public void testFoo(){
		/*
		class A implements Foo{
			public int bar() {return 2;}
		}
		*/
		
		System.out.println(fubar(new A()));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Module2_12().testFoo();
	}

}

interface Foo{
	int bar();
}
