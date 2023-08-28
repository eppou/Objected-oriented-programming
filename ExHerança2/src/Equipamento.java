
public class Equipamento {

	protected boolean ligado;
	
	public void liga() {
		this.ligado = true;
	}

	public void desliga() {
		this.ligado = false;
	}
	
	public boolean getLigado() {
		return this.ligado;
	}
}


