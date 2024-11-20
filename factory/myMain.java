package factory;

public class myMain {

	public static void main(String[] args) {
		beerFactory bf = new beerFactory();
		
		Alcohol alcho1 = bf.GetAlchol("beer");
		alcho1.brew();
		
		Alcohol alcho2 = bf.GetAlchol("vodka");
		alcho2.brew();
		
		Alcohol alcho3 = bf.GetAlchol("rum");
		alcho3.brew();

	}

}
