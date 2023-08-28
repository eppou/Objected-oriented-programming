import java.math.BigDecimal;

public class ContaBancaria {
	private String cliente;
	private String numeroConta;
	protected BigDecimal saldo = BigDecimal.ZERO;
	
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
	
	public BigDecimal sacar(BigDecimal minus) {
		if(this.saldo.compareTo(minus)==1) {
			this.saldo = this.saldo.subtract(minus);
		}
		return minus;
	}
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
}
