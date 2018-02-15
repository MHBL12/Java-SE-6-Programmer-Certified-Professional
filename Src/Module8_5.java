
public class Module8_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Module8_5().go();

	}
	
	public void go()
	{
		Runnable r = new Runnable(){
			public void run() {
				System.out.print("foo");
			}
		};
		
		Thread t = new Thread(r);
		//t.start();
		t.start();
	}

}
