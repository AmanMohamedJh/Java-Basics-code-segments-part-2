package factoryPattern.example3;


public class pizzaFactory {
	
	
	public Pizza getOrder(String pizzaType) {
		if(pizzaType.equalsIgnoreCase("cheese")) {
			return new cheesePizza();
		}
		else if(pizzaType.equalsIgnoreCase("pineapple")) {
			return new pineapplePizza();
		}
		else if(pizzaType.equalsIgnoreCase("Chicken")) {
			return new ChickenPizza();
		}
		else {
			System.out.println("There is no such pizza");
		}
		return null;
	}
}
