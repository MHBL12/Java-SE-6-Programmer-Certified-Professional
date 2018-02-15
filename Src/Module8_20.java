
public class Module8_20 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Record r1 = new Record();
		Record r2 = new Record();
		doTransfer(r1, r2, 5);
		System.out.println("r1= " + r1.get() + ", r2= " + r2.get());
		doTransfer(r2, r1, 2);
		System.out.println("r1= " + r1.get() + ", r2= " + r2.get());
		doTransfer(r1, r2, 1);		
		System.out.println("r1= " + r1.get() + ", r2= " + r2.get());
	}
	
	private static void doTransfer(final Record a, final Record b, final int amount){
		Thread t = new Thread() {
			public void run() {
				new Clerk().transfer(a,b, amount);
			}
		};
		t.start();
		System.out.println("t started");
	}
}
	
	class Clerk {
		public synchronized void transfer(Record a, Record b, int amount)
		{
			synchronized (a){
				synchronized (b) {
					a.add(-amount);
					System.out.println("a= " + a.get() + " amount " + amount);
					b.add(amount);
					System.out.println("b= " + a.get() + " amount " + amount);
				}
			}
		}
	}
 class Record {
	 int num = 10;
	 public int get() {return num;}
	 public void add(int n) { 
		 num = num + n;
		 System.out.println("num= " + num);
	 }
 }

