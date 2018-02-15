
public class Module6_7 {

	public static void test(String str)
	{
		int check = 4;
		if(check = str.length())
		{
			System.out.println(str.charAt(check -= 1) + ",");
		}
		else
		{
			System.out.println(str.charAt(0) +",");
		}
	}
	public static void main(String[] args) {
		test("four");
		test("tee");
		test("to");
		
	}

}
