
public class Main {
	public static void main(String[] args){
		Apple a = AppleFactory.getApple("blue");
		a = AppleFactory.getApple("red");
		a.setName("a1");
		a.setOrigin("Au");
		a.setPrice(100);
		a.showInfo();
		a = AppleFactory.getApple("red");
		a.showInfo();
	}
}
