package factoryPattern.example2;

public class OSFactory {
	
	public OS getInstance(String deviceType) {
		if(deviceType.equalsIgnoreCase("PC")) {
			return new Windows();
		}
		else if(deviceType.equalsIgnoreCase("PHONE")) {
			return new Android();
		}
		else if(deviceType.equalsIgnoreCase("BIGASS")) {
			return new IOS();
		}
		else {
			System.out.println("Thats not a device");
		}
		return null;
	}
}
