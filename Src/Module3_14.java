
public class Module3_14 extends Cup {
	
	public static void takeCup(Cup c){
		if (c instanceof Module3_14){
			System.out.println("inconceivable!");
			
		}else if (c instanceof Cup) {
			System.out.println("Dizzying intellect");
		} else {
			System.exit(0);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cup cup = new Module3_14();
		takeCup(cup);
	}
}

class Cup{}

