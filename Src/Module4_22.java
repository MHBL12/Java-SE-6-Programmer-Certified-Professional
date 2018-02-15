import java.lang.Exception;

class Module4_22 {

	public void process() {
		System.out.print("A ");
	}
	public static void main(String[] args) {
		try{
			((Module4_22)new B()).process();
			//new B().process();
		} catch(Exception e){
			System.out.print("Exception");
			
		}

	}
}

class B extends Module4_22{
	public void process() throws RuntimeException
	{
		super.process();
		if (true) throw new RuntimeException();
		System.out.print("B");
	}
}
	


