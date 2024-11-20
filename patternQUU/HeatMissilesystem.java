package patternQUU;

public class HeatMissilesystem implements Missilesystem {

	private static volatile HeatMissilesystem instance; // step 1

	public HeatMissilesystem() {
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
		System.out.println("Heat missile system "+source);

	}

	@Override
	public void blast(String location) {
		System.out.println("Heat missile system "+location);
	}

}
