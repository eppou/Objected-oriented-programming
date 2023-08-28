
public abstract class Veiculo {
	public String marca;
	public String modelo;
	public String placa;
	
	public void licenciar() {
		System.out.println("veiculo "+marca+" "+modelo+" com a placa "+placa+"esta licenciado");
	}
	
	public abstract int obterNrEixos();

}
