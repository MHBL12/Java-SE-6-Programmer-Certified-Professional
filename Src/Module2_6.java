
public class Module2_6 {
  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Outer o = new Outer();
		Inner i = new Inner();
		int n = 10;
		i.setX(n);
		o.setY(i);
		i.setX(100);
		System.out.println(o.getY().getX());  //this will output 100

	}

}

class Inner{
	private int x;
	public void setX(int x) {this.x = x;}
	public int getX() {return x;}
	
}

class Outer{
	private Inner y;
	public void setY(Inner y) {this.y = y;}
	public Inner getY() {return y;}
}
