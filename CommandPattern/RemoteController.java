package CommandPattern;
//INVOKER
public class RemoteController {
	Command onCommand;
	Command offCommand;
	
	void setCommand(Command onCommand ,Command offCommand) {
		this.onCommand =onCommand;
		this.offCommand=offCommand;
	}
	void onButtonPushed() {
		this.onCommand.execute();
	}
	void offButtonPushed() {
		this.offCommand.execute();
	}
	
}
