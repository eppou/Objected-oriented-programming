import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria{
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void saque(BigDecimal minus) {
		if(this.saldo.compareTo(minus)==1) {
			this.saldo = this.saldo.subtract(minus);
		}
	}
	
	public void calcularNovosaldo(BigDecimal rendimento) {
		this.saldo = this.saldo.multiply(rendimento);
	}
	
}

