
public class SucoDecoratorLC extends SucoDecorator {

	public SucoDecoratorLC(Suco suco) {
		super(suco);
	}
	
	public void fazerSuco(String fruta) {
		super.suco.fazerSuco(fruta);
		System.out.println("foi adicionado leite condensado por + 2 reais");
	}
}
