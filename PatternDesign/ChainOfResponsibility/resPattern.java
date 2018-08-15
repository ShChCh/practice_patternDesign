package patternDesign;

public abstract class resPattern {
	public static int first = 0;
	public static int second = 1;
	public static int third = 2;
	public static int forth = 3;
	public static int fifth = 4;
	
	protected resPattern next;
	public int order = -1;
	
	public resPattern(int order, resPattern nextOne){
		this.order = order;
		this.next = nextOne;
	}
	
	public void setNext(resPattern nextOne){
		this.next = nextOne;
	}
	
	public void doReq(int order, String req){
		if(this.order >= order)
			System.out.println("Order : "+this.order+" finished the request.");
		else
			this.next.doReq(order, req);
	}
}
