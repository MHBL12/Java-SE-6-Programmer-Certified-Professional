
public class Module2_14 extends TestA{

	public void start(){
		System.out.println("TestB");
	}	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		((TestA)new Module2_14()).start();
	}
}

class TestA{
public void start()
{
	System.out.println("TestA");
}
}

