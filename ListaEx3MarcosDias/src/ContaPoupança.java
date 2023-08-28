import java.math.BigDecimal;

public class ContaPoupança extends ContaBancaria{
	private int diaDeRendimento;
	
	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	public void calcularNovoSaldo(BigDecimal tr){
		this.saldo = this.saldo.multiply(tr);
	}
}
