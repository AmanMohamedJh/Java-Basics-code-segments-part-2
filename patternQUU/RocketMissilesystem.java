package patternQUU;

public class RocketMissilesystem implements Missilesystem{
	private static volatile HeatMissilesystem instance; // step 1

	public RocketMissilesystem() {
		// TODO Auto-generated constructor stub
	}
	
	public HeatMissilesystem getInstance() {
		
		if(instance==null) {
			instance = new HeatMissilesystem();
		}
		
		return instance;
	}
	@Override
	public void launch(String source) {
		System.out.println("Rocket missile system "+source);
		
	}

	@Override
	public void blast(String location) {
		System.out.println("Rocket missile system "+location);
		
	}

}
