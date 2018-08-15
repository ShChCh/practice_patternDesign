
public class Main {
	public static void main(String[] args){
		Adaptee a = new Adaptee();
		Target t = new Adaptor(a);
		t.getProduct();
	}
}
