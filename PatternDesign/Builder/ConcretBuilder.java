
public class ConcretBuilder extends AbstractBuilder{
	private Product newProduct = new Product();
	public void setVal(String arg1, int arg2){
		newProduct.setName(arg1);
		newProduct.setPrice(arg2);
	}
	public Product getProduct(){
		return newProduct;
	}

}
