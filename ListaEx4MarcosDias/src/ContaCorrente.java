import java.math.BigDecimal;

public class ContaCorrente {

	private String cliente;
	private String numeroConta;
	private BigDecimal saldo= BigDecimal.ZERO;
	private BigDecimal limite = BigDecimal.ZERO;
	

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
	
	public BigDecimal getLimite() {
		return limite;
	}
	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}
	
	public BigDecimal sacar(BigDecimal minus) {
		
		if(this.limite.compareTo(minus)==1) {
			this.saldo.subtract(minus);
		}
		else {
			System.out.println("nao foi possivel realizar o saque");
		}
		return minus;
	}
	
	public void depositar(BigDecimal plus) {
		this.saldo = this.saldo.add(plus);
	}
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
}
