
public abstract class AbstractDecorator implements productInfo{
	protected productInfo info;
	public AbstractDecorator(productInfo p){
		this.info = p;
	}
	public void showInfo(){
		this.info.showInfo();
	}
}
