
public class Module3_15 extends SimpleCalc {

	public void calculate() { value -= 3;}
	public void calculate(int multiplier){
		calculate();
		super.calculate();
		value *= multiplier;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Module3_15 calculator = new Module3_15();
		calculator.calculate(2);
		System.out.println("Value is: " + calculator.value);
	}
}

class SimpleCalc {
	public int value;
	public void calculate() {
		value += 7;
	}
}
