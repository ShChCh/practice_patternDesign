
public class Banana extends Observer{

	public Banana(Subject s){
		this.sub = s;
		this.sub.addObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Banana update. state: "+(this.sub.getCurrState()*5));
	}
}
