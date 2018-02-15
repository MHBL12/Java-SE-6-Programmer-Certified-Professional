
public class Module2_26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee e = new Employee("4321");
		System.out.println(e.empID + e.name);
	}
}

class Person {
	String name = "No name";
	public Person(String nm) {name = nm;}
}

class Employee extends Person {
	String empID = "0000";
	public Employee(String aa)
	{
		super(aa);
	}
	/*
	public Employee(String id)
	{
		
		empID = id;
	}
	*/
}
