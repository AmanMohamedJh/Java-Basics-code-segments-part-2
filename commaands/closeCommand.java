package commaands;

public class closeCommand implements command{
	Gates gate;
	
	public closeCommand(Gates gate) {
		this.gate = gate;
	}
	@Override
	public void executes() {
		gate.close();
		
	}
}
