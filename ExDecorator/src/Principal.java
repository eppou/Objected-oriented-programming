
public class Principal {

	public static void main(String[] args) {
		String fruta = "morango";
		Suco abacaxi = new SucoDecoratorLC(new SucoDecoratorLeite(new SucoBasico()));
		abacaxi.fazerSuco(fruta);
	}

}
