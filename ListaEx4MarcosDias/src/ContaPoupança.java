import java.math.BigDecimal;

public class ContaPoupança implements ContaBancaria {
	private String cliente;
	private String numeroConta;
	private int diaRendimento;
	BigDecimal saldo= BigDecimal.ZERO;
	
	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public BigDecimal sacar(BigDecimal minus) {
		if(this.saldo.compareTo(minus)==1) {
			this.saldo = this.saldo.subtract(minus);
		}
		return minus;
	}
	
	public void depositar(BigDecimal plus) {
		this.saldo = this.saldo.add(plus);
	}
	
	public void calcularNovosaldo(BigDecimal rendimento) {
		this.saldo = this.saldo.multiply(rendimento);
	}
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
}
