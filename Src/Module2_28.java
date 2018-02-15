public class Module2_28 {
	int bootch;
	String snootch;
	
	public Module2_28(){
		this("snootchy");
		System.out.print("first ");
	}
	
	public Module2_28(String snootch){
		this(420, "snootchy");
		System.out.print("second ");
	}
	
	public Module2_28(int bootch, String snootch){
		this.bootch = bootch;
		this.snootch = snootch;
		System.out.print("third ");
	}
	
	public static void main(String[] args)
	{
		Module2_28 b = new Module2_28();
		System.out.print(b.snootch + " " + b.bootch);
	}
}
