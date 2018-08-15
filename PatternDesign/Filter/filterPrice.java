import java.util.*;


public class filterPrice implements filter{

	@Override
	public List<product> filterProduct(List<product> l) {
		// TODO Auto-generated method stub
		List<product> re = new ArrayList<product>();
		for(product item: l){
			if(item.getPrice() >= 10)
				re.add(item);
		}
		return re;
	}

}
