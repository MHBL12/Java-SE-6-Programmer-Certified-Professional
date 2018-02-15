import java.util.TreeSet;

public class Module7_20 implements Comparable {

	public String name;
	public int compareTo(Object o)
	{
		//return 0;
		return ((String)name).compareTo((String)((Module7_20) o).name);
	}
	public static void main(String[] args) {
		Module7_20 one = new Module7_20();
		Module7_20 two = new Module7_20();
		Module7_20 three = new Module7_20();
		one.name = "Coffee";
		two.name = "Tea";
		three.name = "Milk";
		TreeSet set = new TreeSet();
		set.add(one);
		set.add(two);
		set.add(three);
		System.out.println(set.size());
		

	}

}
