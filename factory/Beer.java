package factory;

public class Beer implements Alcohol {
	@Override
	public void brew() {
		System.out.println("We are brewing Beer");
	}
}
