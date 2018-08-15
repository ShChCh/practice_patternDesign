public class Client {
	public static void main(String[] args){
		Solution.IFactory factory = new Solution().new Factory();
		factory.createProductA().showProduct();
		factory.createProductB().showProduct();
	}
}
