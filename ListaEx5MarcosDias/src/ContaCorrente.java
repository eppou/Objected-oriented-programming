import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria {
	private BigDecimal limite = BigDecimal.ZERO;
	
	public BigDecimal getLimite() {
		return limite;
	}
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
	
	public void saque(BigDecimal minus) {
		
		if(this.limite.compareTo(minus)==1) {
			this.saldo.subtract(minus);
		}
		else {
			System.out.println("nao foi possivel realizar o saque");
		}
	}
}
