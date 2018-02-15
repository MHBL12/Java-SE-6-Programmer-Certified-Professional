
public class Module3_7 {

	public static final String FOO = "foo";
	
	public void test()
	{
		System.out.print("Base");
	}
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Module3_7 b = new Module3_7();
		Sub s = new Sub();
		System.out.print(Module3_7.FOO);
		System.out.print(Sub.FOO);
		System.out.print(b.FOO);
		System.out.print(s.FOO);
		System.out.print(((Module3_7)s).FOO);
		((Module3_7)s).test();

	}
	
}

class  Sub extends Module3_7 {
	public static final String FOO = "bar";
	public void test()
	{
		System.out.print("Sub");
	}
	
	
}