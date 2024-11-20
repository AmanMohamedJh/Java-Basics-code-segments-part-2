package CommandPattern;

public class myMain {

	public static void main(String[] args) {
		Light bedLight = new BedroomLight();
		Light livLight = new livingroomLight();
		
		Command onBedLight = new onCommand(bedLight);
		Command offBedLight = new offCommand(bedLight);
		
		
		RemoteController remote = new RemoteController();
		remote.setCommand(onBedLight, offBedLight);
		
		remote.onButtonPushed();
		remote.offButtonPushed();

	}

}
