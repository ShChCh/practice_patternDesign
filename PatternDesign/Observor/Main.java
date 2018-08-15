
public class Main {
	public static void main(String[] args){
		Subject s = new Subject();

		new Apple(s);
		new Banana(s);

		s.setCurrState(1);
		s.setCurrState(10);
		s.setCurrState(30);
	}
}
