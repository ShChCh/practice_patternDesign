import java.awt.List;
import java.util.*;


public class DemoContainer implements handler{

	public ArrayList<String> products = new ArrayList<String>();
	private int index = 0;
	
	public DemoContainer(ArrayList<String> inputArr){
		for(String item: inputArr)
			this.products.add(item);
	}
	
	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new nameIterator();
	}
	
	private class nameIterator implements Iterator{
		private int index = 0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(index<products.size())
				return true;
			return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()){
				index++;
				return products.get(index-1);
			}
			return null;
		}
	}
}
