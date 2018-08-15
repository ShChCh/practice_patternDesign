
public class Main {
	public static void main(String[] args){
		client A = new client("A");
		client B = new client("B");

		A.sendMsg("Hi from A");
		B.sendMsg("Hello from B");
	}
}
