package patternQU;

public class SetChannelCommand implements Command {

	private Television tv;
	private int channel;

	public SetChannelCommand(Television tv,int channel) {
		this.channel=channel;
		this.tv=tv;
	}

	@Override
	public void execute() {
		tv.setChannel(channel);
	}

}
