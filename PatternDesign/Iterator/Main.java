import java.util.ArrayList;


public class Main {
	public static void main(String[] args){
		ArrayList<String> testList = new ArrayList<String>();
		testList.add("01");
		testList.add("02");
		testList.add("03");
		testList.add("04");
		
		DemoContainer dc = new DemoContainer(testList);
		Iterator ite = dc.getIterator();
		while(ite.hasNext()){
			String item = (String) ite.next();
			System.out.println(item);
		}
	}
}
