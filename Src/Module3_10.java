
public class Module3_10 extends SuperCalc {

	public static int multiply(int a, int b)
	{
		int c = super.multiply(a,b);
		return c;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Module3_10 sc = new Module3_10();
		System.out.println(sc.multiply(3,4));
		System.out.println(Module3_10.multiply(2,2));

	}

}

class SuperCalc {
	protected static int multiply(int a, int b)
	{
		return a * b;
	}
}