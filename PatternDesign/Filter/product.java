
public class product {
	private String name;
	private int price;
	private String origin;
	
	public product(String name, String origin, int price){
		this.name = name;
		this.origin = origin;
		this.price = price;
	}

	public String getOrigin(){
		return this.origin;
	}
	public String getName(){
		return this.name;
	}
	public int getPrice(){
		return this.price;
	}
}
