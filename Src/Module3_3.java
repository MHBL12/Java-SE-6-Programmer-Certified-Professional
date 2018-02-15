
public class Module3_3 {
	
	public static void test() throws RuntimeException {

	try{
		System.out.print("test");
		throw new RuntimeException();
	}
	catch (Exception ex) {System.out.print("exception ");
	}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test();
		}
		catch (RuntimeException ex) 
		{
			System.out.print("runtime ");
		}
		System.out.print("end ");

	}

}
