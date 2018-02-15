import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Module7_24 {	
	
	public static void main(String[] args) 
	{
	  ArrayList a = new ArrayList();
	  for (int i = 1; i < 9; i++)
	  {
	     String s = String.valueOf(i);
		  a.add(s);
	  }
	  
	  //Collections.sort(a, a.reverse());
	  //int result = Collections.binarySearch(a, "6");
	  
	  Comparator c = Collections.reverseOrder();
	  Collections.sort(a, c);
	  int result1 = Collections.binarySearch(a, "6");
	  
	  Comparator d = Collections.reverseOrder();
	  Collections.sort(a, d);
	  int result2 = Collections.binarySearch(a, "6", d);
	  
	  //Comparator e = Collections.reverseOrder(a);
	  //Collections.sort(a, e);
	  //int result3 = Collections.binarySearch(a, "6", e);
	  
	  //Comparator f = new InverseComparator(new Comparator());
	  //Collections.sort(a);
	  //int result4 = Collections.binarySearch(a, "6", f);
	  
	  
	}

}
