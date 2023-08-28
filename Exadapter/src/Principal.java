
public class Principal {
	public static void main(String[] args) throws InterruptedException {
		
		ControleDePonto controleDePonto = 
				new ControleDePonto();
		Funcionario funcionario = 
				new Funcionario("Jo�o de Souza");
		controleDePonto.registrarEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registrarSaida(funcionario);
	}	
		
}
