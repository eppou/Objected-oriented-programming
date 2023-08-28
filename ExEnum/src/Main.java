
public class Main {

	public static void main(String[] args) {

		System.out.println("All sinal and its duration");
		for(Semaforo T: Semaforo.values()) {
			System.out.printf("%s %d%n",T,T.getDuration());
		}
	}

}
