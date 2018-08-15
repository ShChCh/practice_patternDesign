import java.util.HashMap;


public class AppleFactory {
	private static final HashMap<String, Apple> memList = new HashMap<String, Apple>();
	
	public static Apple getApple(String color){
		Apple a = (Apple)memList.get(color);
		if(a==null){
			a = new Apple(color);
			memList.put(color, a);
			System.out.println("Create an apple with color: "+color);
		}
		return a;
	}
}
