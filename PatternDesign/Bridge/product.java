
public class product extends productInfo{
	private int price;
	private String name;
	
	public product(int p, String n, showShape ss){
		super(ss);
		this.price = p;
		this.name = n;
	}
	@Override
	public void showResult() {
		// TODO Auto-generated method stub
		ss.showInfo(name, price);
	}

}
