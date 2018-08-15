
 
class Solution {
	abstract class Product{
		int val;
		public abstract Product getProduct();
		public void print(){}
	}
	public class ProductA extends Product{
		public void print(){
			System.out.println("This is A");
		}
		public Product getProduct(){
			return this;
		}
	}
	public class ProductB extends Product{
		public void print(){
			System.out.println("This is B");
		}
		public Product getProduct(){
			return this;
		}
	}
}