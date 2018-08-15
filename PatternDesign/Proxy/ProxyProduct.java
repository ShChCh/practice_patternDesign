
public class ProxyProduct implements product{
	private RealProduct rp;
	public void showInfo(){
		if(rp==null){
			System.out.println("Loading...");
			rp = new RealProduct();
		}
		rp.showInfo();
	}
}
