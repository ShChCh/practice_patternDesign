
public class Apple extends Observer{
	public Apple(Subject s){
		this.sub = s;
		this.sub.addObserver(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Apple update. state: "+this.sub.getCurrState());
	}

}
