
public class Adaptor implements Target{
	private Adaptee currAdaptee;
	
	public Adaptor(Adaptee a){
		this.currAdaptee = a;
	}
	
	@Override
	public void getProduct() {
		// TODO Auto-generated method stub
		currAdaptee.getFinalProduct();
	}
}
