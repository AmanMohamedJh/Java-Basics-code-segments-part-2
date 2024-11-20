package june_2023_patterns;

public class HeatMissileSystem implements MissileSystem{

	private static volatile HeatMissileSystem instance;
	public HeatMissileSystem() {
		
	}
	
	public static HeatMissileSystem getInstance() {
		if(instance==null) {
			instance= new HeatMissileSystem();
		}
		return instance;
	}
	
	@Override
	public void launch(String source) {
		System.out.println("Heat missile system launching..."+source);
		
	}

	@Override
	public void blast(String destination) {
		System.out.println("Heat missile system Blasting..."+destination);
		
	}

}
