package factoryPattern.example3;

public class myMain {

	public static void main(String[] args) {
		
		pizzaFactory piz = new pizzaFactory();
		
		Pizza pizza1 = piz.getOrder("cheese");
		pizza1.toppings();
		pizza1.price();
		
		Pizza pizza2 = piz.getOrder("pineapple");
		pizza2.toppings();
		pizza2.price();
		
		Pizza pizza3 = piz.getOrder("pasta");
		pizza3.toppings();
		pizza3.price(); 
		

		
		

	}

}
