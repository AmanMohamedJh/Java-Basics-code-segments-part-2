package patternQU;

public class RemoteControl {

	private static volatile RemoteControl instance;
	
	private Command[] commands;

	private RemoteControl() {
		commands = new Command[5];
	}
	public static RemoteControl getInstance() {
		if(instance==null) {
			instance = new RemoteControl();
		}
		
		return instance;
	}
	
	public void setCommand(int slot,Command commands) {
		command[slot] = commands; 
	}

}
