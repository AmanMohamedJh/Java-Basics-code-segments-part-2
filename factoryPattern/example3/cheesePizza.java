package factoryPattern.example3;

public class cheesePizza implements Pizza{
	@Override
	public void toppings() {
		System.out.println("-----CHEESE PIZZA toppings-----");
		System.out.println("Toppings 1: Cheese layer 1 ");
		System.out.println("Toppings 2: Cheese layer 2 with meatballs ");
		System.out.println("Toppings 3: Cheese layer 3 with extra mayonese");
		System.out.println("Toppings 4: Cheese layer 4 with honey included ");
		System.out.println("-----End of CHEESE PIZZA toppings-----");
		System.out.println("");
	}
	public void price() {
		System.out.println("-----CHEESE PIZZA Price list-----");
		System.out.println("all topping sub price      : + 200$ ");
		System.out.println("Discount  (seasonal offer) : -  30$ ");
		System.out.println("Total price                :   170$ ");
	}
}
