package commaands;

public class mainGate implements Gates{
	@Override
	public void open() {
		System.out.println("The Main gates are Opening");
		
	}

	public void close() {
		
		System.out.println("The Main gates are closing");
	}
}
