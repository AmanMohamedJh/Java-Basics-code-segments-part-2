package commaands;

public class openCommand implements command{
	
	Gates gate;
	
	public openCommand(Gates gate) {
		this.gate = gate;
	}
	
	@Override
	public void executes() {
		gate.open();
		
	}
	
}
