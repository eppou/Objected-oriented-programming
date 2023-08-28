import java.math.BigDecimal;

public class ContaInvestimento implements Tributavel ,ContaBancaria {
	private String cliente;
	private String numeroConta;
	BigDecimal saldo = BigDecimal.ZERO;
	
	
	
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
	
	public BigDecimal calcularNovoSaldo(double rendimento) {
		this.saldo = this.saldo.multiply(BigDecimal.valueOf(rendimento));
		return this.saldo;
	}
	
	public BigDecimal calcularTaxaAdministração(double rendimento) {
		BigDecimal original_value = this.saldo;
		this.saldo = this.saldo.multiply(BigDecimal.valueOf(1+rendimento));
		BigDecimal lucro = this.saldo.subtract(original_value);
		return lucro.divide(BigDecimal.valueOf(100));
	}
	
	public BigDecimal calcularTributo(BigDecimal taxaRendimento) {
		BigDecimal original_value = this.saldo;
		BigDecimal ganho = this.saldo.multiply(taxaRendimento);
		System.out.println("ganho"+ganho);
		this.saldo = this.saldo.add(ganho);
		BigDecimal lucro = this.saldo.subtract(original_value);
		return lucro.divide(BigDecimal.valueOf(200));
	}
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
}
