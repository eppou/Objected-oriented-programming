import java.math.BigDecimal;

public interface ContaBancaria {
	
	public void depositar(BigDecimal plus);
	
	public BigDecimal sacar(BigDecimal minus);
	
}
