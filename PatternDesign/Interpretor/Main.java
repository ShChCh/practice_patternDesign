
public class Main {
	public static void main(String[] args){
		SampleExpression isApple = new SampleExpression("1001");
		System.out.println(isApple.Interpret("1002 is Apple?"));
		System.out.println(isApple.Interpret("1001 is Apple?"));
		 
	}
}
