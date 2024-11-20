package CommandPattern;

public class offCommand implements Command {
	Light light;
	
	public offCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}
}
