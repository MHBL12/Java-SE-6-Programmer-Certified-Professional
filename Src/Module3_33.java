
public class Module3_33 extends Alpha{
	public void foo(String a)
	{
		System.out.print("Beta:foo ");
	}
	
	public void bar(String a)
	{
		System.out.print("Beta:bar ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Alpha a = new Module3_33();
		Module3_33 b = (Module3_33)a;
		a.foo( "test");
		b.foo("test");
		a.bar("test");
		b.bar("test");

	}

}

class Alpha {
	public void foo(String ...args )
	//public void foo(String a)
	{
		System.out.print("Alpha:foo ");
	}
	
	public void bar(String a)
	{
		System.out.print("Alpha:bar ");
	}
}

