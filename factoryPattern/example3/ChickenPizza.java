package factoryPattern.example3;

public class ChickenPizza implements Pizza{
	@Override
	public void toppings() {
		System.out.println("-----CHICKEN PIZZA toppings-----");
		System.out.println("Toppings 1: Chicken pieces    - layer 1 ");
		System.out.println("Toppings 2: sliced Chicken    - layer 2 with musturd ");
		System.out.println("Toppings 3: develled Chicken  - layer 3 with extra mayonese");
		System.out.println("Toppings 4: extra liquid      - layer 4 with source included ");
		System.out.println("-----End of CHEESE PIZZA toppings-----");
		System.out.println("");
	}
	public void price() {
		System.out.println("-----CHEESE PIZZA Price list-----");
		System.out.println("all topping sub price      : + 550$ ");
		System.out.println("Discount  (seasonal offer) : -  50$ ");
		System.out.println("Total price                :   500$ ");
	}
}
