package SampleQuestions;

public class Module1_3 {
public int getValue() {
	int value = 0;
	boolean setting = true;
	String title = "Hello";
	if (value || (setting && title == "Hello")) 
	{return 1;}
	if (value == 1 & title.equals("Hello"))
	{ return 2;}
	
			
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Module1_3 a = new Module1_3();
		a.getValue();

	}

}
