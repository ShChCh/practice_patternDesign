import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args){
		product allProduct = new product("all Product","AU",1000);

		product apples = new product("apples","AU",400);
		apples.addProduct(new product("Apple01","AU",150));
		apples.addProduct(new product("Apple02","AU",250));
		
		product oranges = new product("oranges","ZH",600);
		oranges.addProduct(new product("Orange01","ZH",200));
		oranges.addProduct(new product("Orange02","ZH",400));

		allProduct.addProduct(apples);
		allProduct.addProduct(oranges);
		
		System.out.println(allProduct);
		for(product a: allProduct.getSubList()){
			System.out.println(a);
			for(product o: a.getSubList())
				System.out.println(o);
		}
	}
}
