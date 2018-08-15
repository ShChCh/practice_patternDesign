
public class AndSentence implements sentence{

	private sentence contextA;
	private sentence contextB;
	
	@Override
	public boolean Interpret(String s) {
		// TODO Auto-generated method stub
		return this.contextA.Interpret(s) && this.contextB.Interpret(s);
	}

	public AndSentence(sentence A, sentence B){
		this.contextA = A;
		this.contextB = B;
	}

	public sentence getContextA() {
		return contextA;
	}

	public void setContextA(sentence contextA) {
		this.contextA = contextA;
	}

	public sentence getContextB() {
		return contextB;
	}

	public void setContextB(sentence contextB) {
		this.contextB = contextB;
	}
}
