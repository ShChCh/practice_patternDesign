
public class Product {
	public String name;
	public int price;
	public void setPrice(int p){
		this.price = p;
	}
	public void setName(String n){
		this.name = n;
	}
	public void showInfo(){
		System.out.println("name: "+name);
		System.out.println("price: "+price);
	}
}
