import java.math.BigDecimal;

public class Funcionario extends Pessoa{
	protected BigDecimal salario;
	protected String matricula;
	
	public Funcionario(String nome,String sobrenome,BigDecimal salario,String matricula) {
		super(nome,sobrenome);
		this.salario = salario;
		this.matricula = matricula;
	}
	
	public BigDecimal getSalario() {
		return salario;
	}
	
	public void setSalario(BigDecimal salario) {
		if(salario.compareTo(BigDecimal.ZERO)>=0) {
			this.salario = salario;
		}
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public BigDecimal getSalarioPrimeiraParcela () {
		return this.salario.multiply(BigDecimal.valueOf(0.6));
	}
	
	public BigDecimal getSalarioSegundaParcela () {
		return this.salario.multiply(BigDecimal.valueOf(0.4));
	}
}
