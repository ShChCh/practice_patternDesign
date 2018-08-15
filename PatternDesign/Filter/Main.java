import java.util.ArrayList;
import java.util.List;


public class Main {
	/**
	 * test case:
	 * (name, price, origin)
	 * 1001, 3, AU
	 * 1001, 10, AU
	 * 1001, 10, US
	 * 2018, 10, AU
	 * 
	 */
	public static void main(String[] args){
		List<product> testList = new ArrayList<product>();
		testList.add(new product("1001","AU",3));
		testList.add(new product("1001","AU",10));
		testList.add(new product("1001","US",10));
		testList.add(new product("2018","AU",10));
		
		filter f = new frontFilter(new filterPrice(), new filterName());
		List<product> re = f.filterProduct(testList);
		for(product item: re){
			System.out.println("Result item: n="+item.getName()
					+" p="+item.getPrice()
					+" o="+item.getOrigin());
		}
	}
}
