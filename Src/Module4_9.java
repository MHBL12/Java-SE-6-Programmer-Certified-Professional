
public class Module4_9 {

	/**
	 * @param args
	 */
	public void count(int i){
		count(++i);		
	}
	public static void main(String[] args) {
		Module4_9 a = new Module4_9();
		a.count(3);

	}

}
