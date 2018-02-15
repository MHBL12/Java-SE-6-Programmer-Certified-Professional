
public class Module2_5 {

	private final int id;
	public Module2_5(int id) {this.id = id;}
	public void updateId(int newId) {id = newId;}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Module2_5 fa = new Module2_5(42);
		fa.updateID(69);
		System.out.println(fa.id);

	}

}
