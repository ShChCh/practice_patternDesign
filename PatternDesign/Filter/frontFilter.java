import java.util.List;


public class frontFilter implements filter{

	private filter filter1;
	private filter filter2;
	
	public frontFilter(filter a, filter b){
		this.filter1 = a;
		this.filter2 = b;
	}
	@Override
	public List<product> filterProduct(List<product> l) {
		// TODO Auto-generated method stub
		List<product> tmpResult = null;
		if(filter1!=null)
			tmpResult = filter1.filterProduct(l); 
		if(filter2!=null)
			tmpResult = filter2.filterProduct(tmpResult);
		return tmpResult;
	}

}
