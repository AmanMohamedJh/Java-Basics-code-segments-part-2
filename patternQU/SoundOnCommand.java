package patternQU;

public class SoundOnCommand implements Command{
 
	private SoundSystem sound;
	
	public SoundOnCommand(SoundSystem sound) {
		this.sound=sound;
	}
	
	@Override
	public void execute() {
		sound.turnOn();
		
	}

}
