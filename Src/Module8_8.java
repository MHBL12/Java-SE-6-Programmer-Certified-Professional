
public class Module8_8 extends Thread {

	private int x = 2;

	public static void main(String[] args) throws Exception {
		new Module8_8().makeItSo();
	}

	public Module8_8() {
		x = 5;
		start();
	}

	public void makeItSo() throws Exception {
		join();
		x = x - 1;
		System.out.println(x);
	}

	public void run() {
		x *= 2;
	}
}
