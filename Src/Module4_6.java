
public class Module4_6 {

	public static void parse(String str)
	{

		try{
		float f = Float.parseFloat(str);
		}
		catch (NumberFormatException nfe){
			f = 0;
		}
		finally {
			System.out.println(f);
	}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		parse("invalid");

	}

}
