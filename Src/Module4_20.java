import java.lang.Exception;
import java.lang.Error;

public class Module4_20 {

	/**
	 * @param args
	 */
	static void test() throws Error
	{
		if (true)
		{
			throw new AssertionError();
		}
		System.out.print("test");
	}
	public static void main(String[] args) {
		try{
			test();
		}catch(Exception ex)
		{
			System.out.print("exception");
		}
		System.out.print("elld");

	}

}
