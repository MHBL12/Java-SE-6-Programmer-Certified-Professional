
public class Module3_32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Q a = new Q();
		Q b = new P();
		System.out.println(a.greeting() + " has name " + a.getName());
		System.out.println(b.greeting() + " has name " + b.getName());
	}

}

class Q {
	public Q(){}
	String name = "A";
	String getName() {
		return name;
	}
	
	String greeting(){
		return "class A";
	}
}


class P extends Q{

	String name = "B";
	/*
	String getName() {
		return name;
	}
	*/
	String greeting() {
		return "class B";
	}
}



