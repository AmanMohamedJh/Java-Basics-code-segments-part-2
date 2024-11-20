package june_2023_patterns;

public class BlastMissile implements MissileOperation{

	private MissileSystem ms;
	
	
	public BlastMissile(MissileSystem ms) {
		super();
		this.ms = ms;
	}



	@Override
	public void initiateOperation(String location) {
		System.out.println("initiating blast missile ..."+location);
		
	}

}
