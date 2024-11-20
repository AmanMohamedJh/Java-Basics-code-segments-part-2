package CommandPattern;

public class BedroomLight implements Light {
	@Override
	public void on() {
		System.out.println("The bedroom light is ON");

	}

	@Override
	public void off() {
		System.out.println("The bedroom light is OFF");

	}
}
