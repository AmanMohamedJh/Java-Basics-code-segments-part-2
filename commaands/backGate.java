package commaands;

public class backGate implements Gates {
	@Override
	public void open() {
		System.out.println("The back gates are opening");

	}

	@Override
	public void close() {
		
		System.out.println("The back gates are closing");
	}
}
