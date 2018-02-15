import java.io.IOException;

class Module4_10 {

	public void process() throws IOException
	{
		System.out.print("A");
	}	
}

class B1 extends Module4_10{
	public void process() throws IOException
	{
		super.process();
		System.out.print("B,");
		throw new IOException();
	}
	
	public static void main(String[] args)
	{
		try
		{			
			new B1().process();
		}
		catch(IOException e)
		{
			System.out.println("Exception");
			
		}
}
	}



