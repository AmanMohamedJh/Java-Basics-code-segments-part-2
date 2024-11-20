package commaands;

public class remoteController {
	command openCommand;
	command closeCommand;

	void setCommand(command openCommand,command closeCommand) {
		this.openCommand = openCommand;
		this.closeCommand=closeCommand;
	}
	
	void openButtonPushed() {
		this.openCommand.executes();
	}
	void closeButtonPushed() {
		this.closeCommand.executes();
	}
}
