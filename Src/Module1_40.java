
public class Module1_40 {
	public static void main(String[] args)
	{
		int x = 6;
		Module1_40 p = new Module1_40();
		p.doStuff(x);
		System.out.print("main x= "+ x);
				
	}
	
	void doStuff(int x)
	{
		System.out.print("doStuffx = "+ x++);
	}

}

