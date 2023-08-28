import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{
	protected BigDecimal limite;
	
	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

	@Override
	public BigDecimal sacar(BigDecimal minus) {
		
		if(this.limite.compareTo(minus)==1) {
			this.saldo.subtract(minus);
		}
		else {
			System.out.println("nao foi possivel realizar o saque");
		}
		return minus;
	}
}
