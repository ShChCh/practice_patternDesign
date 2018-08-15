
public class Apple {
	private String color;
	private int price;
	private String name;
	private String origin;

	public Apple(String c){
		this.color = c;
	}
	public void setPrice(int p){
		this.price = p;
	}
	public void setName(String n){
		this.name = n;
	}
	public void setOrigin(String o){
		this.origin = o;
	}
	public void showInfo(){
		System.out.println("Info about this kind of apple: price="+this.price
				+" name="+name
				+" origin="+origin);
	}
}
