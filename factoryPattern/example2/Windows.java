package factoryPattern.example2;

public class Windows implements OS{

	@Override
	public void features() {
		System.out.println("WINDOWS : The most reliable features available ");
		System.out.println("Mostly used in PC devices");
		
	}

}
