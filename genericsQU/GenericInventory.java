package genericsQU;

public class GenericInventory {
	
	//part 1
	public <T extends Number>void calculateAverage(T[] numArr) { //this T can be integer,double or float
		
		double total=0;
		double count=0;
		
		for (T element : numArr) {
			total = total + element.doubleValue(); //we change the T to double value and each double together
			count++;	
		}
		double avg = total/count;
		System.out.println("Average of array : "+avg);
	}
	
	//part 2
	public <T extends Number> void calculateMinimum(T[] numArr) {
		double min = numArr[0].doubleValue(); //getting the minimum number by doubling the first array and store in min
		for (T element : numArr) {
			if(min > element.doubleValue()) {
				min = element.doubleValue();
			}
		}
		System.out.println("minimum value of the array : "+min);
		
	}
	
}
