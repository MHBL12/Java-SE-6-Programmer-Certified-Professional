interface TestA { String toString(); }
public class Module2_29 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(new TestA() {
			public String toString() { return "test"; }
		});
	}
}

