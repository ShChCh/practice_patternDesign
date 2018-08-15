
public class AtomSentence implements sentence{
	private String context;
	public AtomSentence(String c){
		this.context = c;
	}
	@Override
	public boolean Interpret(String s) {
		// TODO Auto-generated method stub
		return context.contains(s) || s.contains(this.context);
	}
	public String getContext(){
		return this.context;
	}
	
}
