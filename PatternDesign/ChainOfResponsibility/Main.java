package patternDesign;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		resPattern chainNode1 = new ThirdOrder(null);
		resPattern chainNode2 = new FirstOrder(chainNode1);
		
		chainNode2.doReq(2, "Happy java");
	}

}
