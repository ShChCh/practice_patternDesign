public class Factory{
	public static Solution.Product createProduct(String input){
		Solution.Product returnP = null;
		if(input.equals("A"))
			returnP = new Solution().new ProductA();
		if(input.equals("B"))
			returnP = new Solution().new ProductB();
		return returnP;
	}
	public static void main(String[] args){
		Solution.Product test = Factory.createProduct("A");
		test.print();
		Solution.Product test1 = Factory.createProduct("B");
		test1.print();
	}
}
