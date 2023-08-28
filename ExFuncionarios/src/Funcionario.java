
public class Funcionario {

	public float salario;
	public String nome;
	private static float vale;
	
	public static void setVale (float valee) {
		vale = valee;
	}
	
	public static void changeVale (float taxa) {
		vale = vale*(1+taxa);
	}
	
	public static float returnVale () {
		return vale;
	}
}
