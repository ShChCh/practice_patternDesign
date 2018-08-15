import java.util.ArrayList;
import java.util.List;


public class filterName implements filter{

	@Override
	public List<product> filterProduct(List<product> l) {
		// TODO Auto-generated method stub
		List<product> re = new ArrayList<product>();
		for(product item: l){
			if(item.getName().startsWith("1"))
				re.add(item);
		}
		return re;
	}
}
