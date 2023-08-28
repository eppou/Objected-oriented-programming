
public abstract class SucoDecorator implements Suco {
	protected Suco suco;
	
	public SucoDecorator(Suco suco) {
		this.suco = suco;
	}
	
	@Override
	public void fazerSuco(String fruta) {
		this.suco.fazerSuco(fruta);
	}	
	
}
