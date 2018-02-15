import java.lang.Exception;

public class Module4_23 {

	void process() throws Exception
	{
		throw new Exception();
	}
	public static void main(String[] args) {
		Module4_23 a = new B();
		try {
			a.process();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

static class B extends Module4_23{
	void process(){
		System.out.println("B");
	}
}
