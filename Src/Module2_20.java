
public class Module2_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Three();
	}

}

class One {
	public One() {System.out.print(1);}
}

class Two extends One {
	public Two() {System.out.print(2);}
}

class Three extends Two {
	public Three() {System.out.print(3);}
}
	
