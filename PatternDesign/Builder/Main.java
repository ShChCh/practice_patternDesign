
public class Main {
	public static void main(String[] args){
		Director d = new Director();
		Product a = d.getApple();
		a.showInfo();

		Product b = d.getBanana();
		b.showInfo();
	}
}
