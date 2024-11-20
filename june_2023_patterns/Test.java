package june_2023_patterns;

public class Test {

	public static void main(String[] args) {
		MissileController controller = MissileController.getInstance();
		
		MissileSystem heat = HeatMissileSystem.getInstance();
		MissileOperation heatblast = new BlastMissile(heat); 
		MissileOperation heatlaunch = new LaunchMissile(heat); 
		
		MissileSystem rocket = RocketMissileSystem.getInstance();
		MissileOperation rocketblast = new BlastMissile(rocket);
		MissileOperation rocketlaunch = new LaunchMissile(rocket);
		
		System.out.println("initilize heat missile system");
		controller.setBlast(heatblast);
		controller.setlaunch(heatlaunch);
		
		controller.performBlasting("India");
		controller.performLaunching("Pakistan");
		
		System.out.println("initilize Rocket missile system");
		controller.setBlast(rocketblast);
		controller.setlaunch(rocketlaunch);
		
		controller.performBlasting("Russia");
		controller.performLaunching("USA");
		
	}

}
