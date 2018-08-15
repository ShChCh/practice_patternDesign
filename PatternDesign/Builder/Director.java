
public class Director {
	private AbstractBuilder newBuilder = new ConcretBuilder();
	public Product getApple(){
		newBuilder.setVal("Apple", 5);
		return newBuilder.getProduct();
	}
	public Product getBanana(){
		newBuilder.setVal("Banana", 3);
		return newBuilder.getProduct();
	}
}
