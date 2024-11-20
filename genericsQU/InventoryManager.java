package genericsQU;

public class InventoryManager {

	public static void main(String[] args) {
		GenericInventory obj1 = new GenericInventory();
		GenericInventory obj2 = new GenericInventory();

		Integer[] intArr = {1,3,4,7,2};
		obj1.calculateAverage(intArr);
		obj1.calculateMinimum(intArr);
		
		Double[] doubleArr = {5.5,3.24,1.28,9.4,10.01};
		obj2.calculateAverage(doubleArr);
		obj2.calculateMinimum(doubleArr);
	}

}
