import java.util.*;


public class Module7_39 {
 public static void foo(List<Object> list) {}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> x1 = new ArrayList<String>();
		foo(x1);
		
		ArrayList<Object> x2 = new ArrayList<String>();
		foo(x2);
		
		ArrayList<Object> x3 = new ArrayList<Object>();
		foo(x3);
		
	    ArrayList x4 = new ArrayList();
	    foo(x4);

	}

}
