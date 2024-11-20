package commaands;

public class myMain {

	public static void main(String[] args) {
		Gates mainG = new mainGate();
		Gates backG = new backGate();
		
		//opening and closing main gate
		command opMainGate = new openCommand(mainG);
		command clMainGate = new closeCommand(mainG);
		
		remoteController remote = new remoteController();
		remote.setCommand(opMainGate, clMainGate);
		
		remote.openButtonPushed();
		remote.closeButtonPushed();
		
		//opening and closing back gate
		
		command opBackGate = new openCommand(backG);
		command clBackGate = new closeCommand(backG);
		
		remote.setCommand(opBackGate, clBackGate);
		
		remote.openButtonPushed();
		remote.closeButtonPushed();
	}

}
