package factoryPattern.example2;

public class IOS implements OS{
	@Override
	public void features() {
		System.out.println("IOS : Most secured but not that much of features available since 18th century");
		System.out.println("Mostly used in phone devices");
		System.out.println("Total nutjob");
	}
}
