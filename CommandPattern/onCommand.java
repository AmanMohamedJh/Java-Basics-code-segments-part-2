package CommandPattern;

public class onCommand implements Command {
	Light light;
	
	public onCommand(Light light) {
		this.light=light;
	}
	
	@Override
	public void execute() {
		light.on();
	}
}
