import java.util.ArrayList;
import java.util.List;


public class filterOrigin implements filter {

	@Override
	public List<product> filterProduct(List<product> l) {
		// TODO Auto-generated method stub
		List<product> re = new ArrayList<product>();
		for(product item: l){
			if(item.getOrigin().equals("AU"))
				re.add(item);
		}
		return re;
	}
}
