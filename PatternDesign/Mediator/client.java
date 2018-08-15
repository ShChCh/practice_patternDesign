
public class client {
	private String name;
	public String getName(){
		return this.name;
	}
	public client(String n){
		this.name = n;
	}
	public void sendMsg(String msg){
		Mediator.sendMsg(msg, this);
	}
}
