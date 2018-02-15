import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Module7_25 {

	public static Iterator reverse(List list)
	{
		Collections.reverse(list);
		return list.iterator();
	}
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		for(Object ojb: reverse(list))
		//for (Object obj:list)  //this option works
		{
			System.out.print(obj+",");
		}

	}

}
