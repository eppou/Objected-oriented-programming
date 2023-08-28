import java.util.HashSet;

public interface Subject {

	HashSet<Observer> observers = new HashSet<Observer>();
	
	public void  attach(Observer o);
	
	public void detach(Observer o);
	
	public void Notify();
	
	
}
