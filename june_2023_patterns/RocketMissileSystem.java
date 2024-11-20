package june_2023_patterns;

public class RocketMissileSystem implements MissileSystem{

	private static volatile RocketMissileSystem instance;
	
	public RocketMissileSystem() {
	
	}
	
	public static RocketMissileSystem getInstance() {
		if(instance == null) {
			instance = new RocketMissileSystem();
		}
		return instance;
	}
	
	@Override
	public void launch(String source) {
		System.out.println("Rocket Missile System system launching..."+source);
		
	}

	@Override
	public void blast(String destination) {
		System.out.println("Rocket Missile System launching..."+destination);
		
	}

}
