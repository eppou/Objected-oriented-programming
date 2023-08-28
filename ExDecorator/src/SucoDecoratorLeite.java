
public class SucoDecoratorLeite extends SucoDecorator{

	public SucoDecoratorLeite(Suco suco) {
		super(suco);
	}
	
	public void fazerSuco(String fruta) {
		super.fazerSuco(fruta);
		System.out.println("foi adicionado leite somando + 1 real");
	}
	
	
}
