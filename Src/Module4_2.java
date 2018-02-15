
public class Module4_2 {
	public static void test (String str){
		if (str == null | str.length() == 0)
		{
			System.out.println("string is empty");
		}
		else {
			System.out.println("string is not empty");
		}
	}
		
		public static void main(String[] args)
		{
			test(null);
		}

}
