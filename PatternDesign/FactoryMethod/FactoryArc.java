
public class FactoryArc implements Factory{

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		Product Arc = new ProductArc();
		return Arc;
	}

}
