import java.util.ArrayList;

public class ListaFila {

	ArrayList<String> fila = new ArrayList<String>() ; 
	
	void Entrar(String nome) {
		this.fila.add(nome);
	}
	
	void Sair(String nome) {
		this.fila.remove(nome);
	}
	
	String Atender() {
		String nome;
		nome = this.fila.get(1);
		return nome;
	}
	
	void Buscar(String nome) {
		fila.indexOf(nome);
	}
	
	void Imprimir() {
		for(String imprimido : fila) {
			System.out.println(imprimido);
		}
	}
}
