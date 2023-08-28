
public class Pessoa {

	protected String nome;
	protected String sobrenome;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome1,String sobrenome) {
		this.nome = nome1;
		this.sobrenome = sobrenome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getNomeCompleto() {
		return this.nome + this.sobrenome;
	}
}
