
public class Gerente {

	public double salario;
	public String nome;
	
	public void aumentoSalario() {
		this.salario = this.salario*1.1;
	}
	
	public void aumentoSalario(double variation) {
		this.salario = this.salario*(1+variation);
	}
	
}

