
public class Principal {

	public static void main(String args[]) {
		
		pizzaria pizzaria1 = new PizzariaSeuCarlos();
		pizza pizza1 = pizzaria1.createPizza(2);
		pizza1.entrega();
	}
}
