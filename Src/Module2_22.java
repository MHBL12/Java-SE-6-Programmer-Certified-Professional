
public class Module2_22 implements DeclareStuff{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 5;
		new Module2_22().doStuff(++x);
	}
	public void doStuff(int s)
	{
		s += EASY + ++s;
		System.out.println("s " + s);
	}
}

interface DeclareStuff
{
  public static final int EASY = 3;
  void doStuff(int t);
}

