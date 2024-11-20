package CommandPattern;

public class livingroomLight implements Light {
	@Override
	public void on() {
		System.out.println("Living room light is ON");

	}

	@Override
	public void off() {
		System.out.println("Living room light is OFF");
	}
}
