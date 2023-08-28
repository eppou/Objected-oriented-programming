import java.util.ArrayList;

public class morador {

	private String nome;
	private int apartamento;
	ArrayList<Carro> Car = new ArrayList<Carro>();
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setApartamento(int ap) {
		this.apartamento = ap;
	}
	
	public int getApartamento() {
		return this.apartamento;
	}
	
	public ArrayList<Carro> getCar() {
		return (this.Car);
	}
	
	public void setCar(ArrayList<Carro> car) {
		this.Car = car; 
	}

}
