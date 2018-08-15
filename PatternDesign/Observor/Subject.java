import java.util.ArrayList;
import java.util.List;


public class Subject {
	private List<Observer> obList = new ArrayList<Observer>();
	private int currState;
	
	public List<Observer> getObList() {
		return obList;
	}
	
	public void addObserver(Observer o){
		this.obList.add(o);
	}
	public void notifyAllObservers(){
		for(Observer o: obList)
			o.update();
	}
	public void setCurrState(int currState) {
		this.currState = currState;
		this.notifyAllObservers();
	}
	
	public void setObList(ArrayList<Observer> obList) {
		this.obList = obList;
	}
	public int getCurrState() {
		return currState;
	}
	
	
}
