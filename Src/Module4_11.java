public class Module4_11 {
    public String sayHello(String name) throws TestException{
    	if(name == null)
    	{ throw new TestException();}
    	return "Hello" + name;
    }
	public static void main(String[] args) {
		Module4_11 a = new Module4_11();
		
			System.out.println(a.sayHello("John"));
		

	}

}

class TestException extends Exception{}
