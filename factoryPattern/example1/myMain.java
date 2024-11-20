package factoryPattern.example1;

public class myMain {

	public static void main(String[] args) {
		ShapeFactory sh = new ShapeFactory();
		
		Shape shap1 = sh.getShape("CIRCLE");
		shap1.draw();
		
		Shape shap2 = sh.getShape("RECTANGLE");
		shap2.draw();
		
		Shape shap3 = sh.getShape("SQUARE");
		shap3.draw();

	}

}
