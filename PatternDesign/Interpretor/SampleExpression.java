
public class SampleExpression implements sentence{

	public AndSentence aS;
	@Override
	public boolean Interpret(String s) {
		// TODO Auto-generated method stub
		return aS.Interpret(s);
	}
	public SampleExpression(String subject){
		this.aS = new AndSentence(new AtomSentence(subject), new AtomSentence("Apple"));
	}
}
