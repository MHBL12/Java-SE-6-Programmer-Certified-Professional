
public class Module8_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Thread(new Runnable(){
			public void run(){
				System.out.print("Bar");
				
			}
		}).start();

	}

}
