import java.util.LinkedList;

public abstract class pizzaria {
	private LinkedList<pizza> sabores;
	
	public abstract pizza createPizza(int type);
	
	public void newPizza(int type) {
		pizza piz = createPizza(type);
		sabores.add(piz);
	}
	
	public void entregaPizza(int index) {
		sabores.get(index).entrega();
	}
}
