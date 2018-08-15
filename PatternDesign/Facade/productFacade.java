
public class productFacade {
	private product pA;
	private product pB;
	
	public productFacade(){
		pA = new productA();
		pB = new productB();
	}
	public void showA(){
		pA.showInfo();
	}
	public void showB(){
		pB.showInfo();
	}
}
