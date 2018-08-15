import java.util.ArrayList;
import java.util.List;


public class product {
	private int price;
	private String origin;
	private String name;
	private List<product> subList;
	
	
	public product(String name, String origin, int price){
		this.name = name;
		this.origin = origin;
		this.price = price;
		this.subList = new ArrayList<product>();
	}

	public void addProduct(product p){
		this.subList.add(p);
	}
	public void removeProduct(product p){
		this.subList.remove(p);
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<product> getSubList() {
		return subList;
	}
	public void setSubList(List<product> sl) {
		this.subList = sl;
	}
	
	public String toString(){
		return ""+"name:"+name+"; origin:"+origin+"; price:"+price;
	}
}
