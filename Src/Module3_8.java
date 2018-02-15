
public class Module3_8 extends Pizza{
	public void addTopping(String topping){
		System.out.println("can't add toppings");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pizza pizza = new Module3_8();
		pizza.addTopping("Mushrooms");

	}

}

class Pizza {
	java.util.ArrayList toppings;
	public final void addTopping(String topping){
		toppings.add(topping);
	}
}
