
public class Porta implements Subject {
	
	public void attach(Observer o) {
		observers.add(o);
	}

	@Override
	public void detach(Observer o) {
		observers.remove(o);
	}

	@Override
	public void Notify() {
		for(Observer o: observers) {
			o.update();
		}
	}
}
