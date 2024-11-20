package june_2023_patterns;

public class MissileController {

	MissileOperation launch;
	MissileOperation blast;
	
	
	private static volatile MissileController instance;
	
	private MissileController() {
		
	}
	
	public static synchronized MissileController getInstance() {
		
		if(instance==null) {
			synchronized (MissileController.class) {
				instance = new MissileController();
			}
			
		}
		
		return instance;
	}
	
	public void setlaunch(MissileOperation launch) {
		this.launch=launch;
		
		
	}
	public void setBlast(MissileOperation blast) {
		this.blast=blast;
	}
	
	public void performLaunching(String start) {
		launch.initiateOperation(start);
	}
	public void performBlasting(String end) {
		blast.initiateOperation(end);
	}
	
}
