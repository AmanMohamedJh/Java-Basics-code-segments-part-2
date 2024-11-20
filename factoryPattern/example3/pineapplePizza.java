package factoryPattern.example3;

public class pineapplePizza implements Pizza {
	@Override
	public void toppings() {
		System.out.println("-----PINEAPPLE PIZZA toppings-----");
		System.out.println("Toppings 1: pineapple pieces  - layer 1 ");
		System.out.println("Toppings 2: sliced pineapple  - layer 2 with veggies ");
		System.out.println("Toppings 3: chopped pineapple - layer 3 with extra mayonese");
		System.out.println("Toppings 4: extra liquid      - layer 4 with honey included ");
		System.out.println("-----End of CHEESE PIZZA toppings-----");
		System.out.println("");
	}
	public void price() {
		System.out.println("-----CHEESE PIZZA Price list-----");
		System.out.println("all topping sub price      : + 350$ ");
		System.out.println("Discount  (seasonal offer) : -  50$ ");
		System.out.println("Total price                :   300$ ");
	}
}
