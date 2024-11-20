package june_2023_patterns;

public class LaunchMissile implements MissileOperation {
	MissileSystem ms;

	public LaunchMissile(MissileSystem ms) {
		super();
		this.ms = ms;
	}

	@Override
	public void initiateOperation(String location) {
		System.out.println("initiating Launch missile ..."+location);

	}

}
