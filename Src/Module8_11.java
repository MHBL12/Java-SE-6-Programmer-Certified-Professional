
public class Module8_11 extends Thread {
	
	private int num;
	private boolean isComplete;
	private int result;
	
	public Module8_11(int num) {this.num=num;}
	
	public synchronized void run() {
		result = num * 2;
		isComplete = true;
		notify();
	}
	
	public synchronized int getResult()
	{
		while (!isComplete)
		{
			try {
				wait();
			}catch(InterruptedException e){}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Module8_11[] computations = new Module8_11[4];
		for (int i=0; i<computations.length; i++)
		{
			computations[i] = new Module8_11(i);
			computations[i].start();
		}
		for (Module8_11 c: computations)
		{
		System.out.print(c.getResult() + "");
		}

	}

}
