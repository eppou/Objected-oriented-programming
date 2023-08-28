
public class Combustivel {
	String tipo;
	float litros;
	float preço;
	
	public float getPreçoAbastecimento(float l) {
		return this.preço *l;
		
	}
	
	public float getPreçoAbastecimentoD(float d) {
		return d/this.preço;
	}
}
