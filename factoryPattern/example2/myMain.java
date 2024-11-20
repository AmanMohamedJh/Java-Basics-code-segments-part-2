package factoryPattern.example2;

public class myMain {

	public static void main(String[] args) {
		OSFactory operatingSys = new OSFactory();
		
		OS os1 = operatingSys.getInstance("Phone");
		os1.features();
		
		OS os2 = operatingSys.getInstance("PC");
		os2.features();
		
		OS os3 = operatingSys.getInstance("BIGASS");
		os3.features();
		
		operatingSys.getInstance("Blutooth");
		
	}

}
