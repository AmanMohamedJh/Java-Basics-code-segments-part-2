package patternQU;

public class SoundOffCommand implements Command{
	private SoundSystem sound;
	
	public SoundOffCommand(SoundSystem sound) {
		this.sound=sound;
	}
	
	@Override
	public void execute() {
		sound.turnOff();
		
	}

}
