
public class Main {
	public static void main(String[] args){
		Product test;
		test = new FactoryArc().createProduct();
		test.showShape();
		test = new FactoryTriangle().createProduct();
		test.showShape();
	}
}
