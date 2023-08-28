
public enum Semaforo {
	RED(15),
	YELLOW(3),
	GREEN(20);
	
	private final int duration;
	
	Semaforo(int duration){
		this.duration = duration;
	}
	
	public int getDuration() {
		return this.duration;
	}
}
