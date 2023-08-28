import java.math.BigDecimal;

public abstract class ContaBancaria {
	private String cliente;
	private String numeroConta;
	protected BigDecimal saldo= BigDecimal.ZERO;
	
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

	public void depositar(BigDecimal plus) {
		this.saldo = this.saldo.add(plus);
	}
	
	public abstract void saque(BigDecimal minus);
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
}
