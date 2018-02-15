
public class Module3_9 {
 
	public int a;
	public Module3_9() {a = 3;}
	public void addFive() {a += 5;}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Module3_9 foo = new Bar();
		foo.addFive();
		System.out.println("Value: " + foo.a);

	}

}

class Bar extends Module3_9{
	public int a;
	public Bar() {a = 8;}
	public void addFive() {this.a +=5;}
}
