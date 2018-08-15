
public class Solution {
	interface IProductA {
		public void showProduct();
	}
	interface IProductB {
		public void showProduct();
	}

	class ProductA implements IProductA {
		public void showProduct() {
			System.out.println("This is product A");
		}
	}
	class ProductB implements IProductB {
		public void showProduct() {
			System.out.println("This is product B");
		}
	}

	interface IFactory {
		public IProductA createProductA();
		public IProductB createProductB();
	}
	class Factory implements IFactory{
		public IProductA createProductA() {
			return new ProductA();
		}
		public IProductB createProductB() {
			return new ProductB();
		}
	}

}
