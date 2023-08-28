import java.math.BigDecimal;

public class Professor extends Funcionario {

	public Professor(String nome,String sobrenome,BigDecimal salario,String matricula) {
		super(nome,sobrenome,salario,matricula);
	}
	
	public BigDecimal getSalarioPrimeiraParcela () {
		return this.salario;
	}
	
	public BigDecimal getSalarioSegundaParcela () {
		return this.salario;
	}
	
	@Override
	public String toString() {
		String funcToString = (nome+sobrenome+" "+salario+" "+matricula);
		return funcToString;
	}
}
