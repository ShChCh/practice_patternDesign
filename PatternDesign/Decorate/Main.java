
public class Main {
	public static void main(String[] args){
		productInfo p = new productA();
		p.showInfo();

		p = new ConcreteDecorator(new productA());
		p.showInfo();

		p = new ConcreteDecorator(new productB());
		p.showInfo();
	}
}
