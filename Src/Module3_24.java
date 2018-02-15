
public class Module3_24 {

	String title;
	int value;
	public Module3_24(){
		title += "World";
	}
	
	public Module3_24(int value){
		this.value = value;
		title = "Hello";
		Module3_24();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Module3_24 c = new Module3_24(5);
		System.out.println(c.title);

	}

}
