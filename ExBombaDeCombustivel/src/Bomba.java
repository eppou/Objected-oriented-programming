import java.util.ArrayList;

public class Bomba {
	public int id;
	ArrayList<Combustivel> combustivel = new ArrayList<Combustivel>();
	
	public void adicionarCombustivel(float preço,float litros,String tipo) {
		Combustivel newcomb = new Combustivel();
		newcomb.litros = litros;
		newcomb.preço = preço;
		newcomb.tipo = tipo;
		this.combustivel.add(newcomb);
	}
	
	public float abastecerEmLitros(float l,int i) {
		Combustivel combaux = this.combustivel.get(i);
		combaux.litros = combaux.litros- l;
		return combaux.getPreçoAbastecimento(l);
		
	}
	
	public float abastecerEmDinheiro(float dinheiro, int i) {
		Combustivel combaux = this.combustivel.get(i);
		return combaux.getPreçoAbastecimentoD(dinheiro);
	}
	
	public ArrayList<Combustivel> getCombustivelList(){
		return this.combustivel;
	}
}
