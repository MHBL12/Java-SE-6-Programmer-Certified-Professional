
public class Module8_7 implements Runnable{

	public void run(){
		System.out.println("run");
		throw new RuntimeException("Problem");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new Module8_7());
		t.start();
		System.out.println("End of method");

	}

}
