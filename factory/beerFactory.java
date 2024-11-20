package factory;

public class beerFactory {
	public Alcohol GetAlchol(String Brand) {
		if(Brand == null) {
			return null;
		}
		else if(Brand.equalsIgnoreCase("VODKA")) {
			return new vodka();
		}
		else if(Brand.equalsIgnoreCase("BEER")) {
			return new Beer();
		}
		else if(Brand.equalsIgnoreCase("RUM")) {
			return new Rum();
		}
		return null;
	}
	
	
}
