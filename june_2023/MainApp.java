package june_2023;

public class MainApp {

	public static void main(String[] args) {
		Pair<String,Integer> L1= new Pair<String,Integer>("Test",35);
		Pair<Double,String> L2= new Pair<Double,String>(23.65,"Test 2");
		
		System.out.println("1st Pair");
		L1.getFirst();
		L1.getSecond();
		
		System.out.println();
		System.out.println("2nd Pair");
		L2.getFirst();
		L2.getSecond();
	}

}
