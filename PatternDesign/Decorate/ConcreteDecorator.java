
public class ConcreteDecorator extends AbstractDecorator{
	public ConcreteDecorator(productInfo p){
		super(p);
	}
	
	public void showInfo(){
		info.showInfo();
		this.extraMethod(info);
	}
	
	public void extraMethod(productInfo p){
		System.out.println("Extra method");
	}
}
