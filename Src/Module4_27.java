
public class Module4_27 {
 
	int z = 5;
	
	public void stuff1(int x)
	{
		assert(x > 0);
		switch(x){
		case 2: x = 3;
		default: assert false;
		}
	}
	
	private void stuff2(int y){
		assert(y < 0);
	}
	
	private void stuff3() {
		assert(stuff4());
	}
	
	private boolean stuff4(){
		z = 6;
		return false;
	}
	
	public static void main(String[] args) {
		Module4_27 a = new Module4_27();
		a.stuff1(2);
		a.stuff2(-3);
		a.stuff3();

	}

}
