
public class Pessoas implements Observer {
	private String nome;
	private int cpf;
	
	public Pessoas(String nome, int cpf) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public void update() {
		System.out.println(nome + " " + cpf + "porta foi aberta");
	}
	
}
