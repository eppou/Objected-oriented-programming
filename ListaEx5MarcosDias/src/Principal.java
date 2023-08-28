import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList <ContaBancaria> listaContas = new ArrayList <ContaBancaria> ();
		System.out.printf("Escolha o que irá fazer agora: %n 1-cadastrar conta %n 2-saque de valor %n 3-atualizar a conta poupança com seu rendimento%n 4-depositar valor %n 5-mostrar o saldo da conta%n 6-Calcular os tributos de uma conta %n 7-Calcula a taxa de administração de uma conta investimento%n%n  digite 0 para sair do programa");
		int opt = sc.nextInt();

		while(opt != 0) {
			switch (opt) {
			
			case 1:
				System.out.println("1-para conta corrente       2-para conta poupança       3-para conta investimento");
				int aux1 = sc.nextInt();
				if(aux1 == 1) {
					ContaCorrente contaCrt = new ContaCorrente(); 
					System.out.println("digite o numero da conta");
					contaCrt.setNumeroConta(sc.next());
					System.out.println("digite o saldo");
					contaCrt.depositar(sc.nextBigDecimal());
					System.out.println("digite o nome do cliente");
					contaCrt.setCliente(sc.nextLine());
					sc.nextLine();
					System.out.println("digite o limite");
					contaCrt.setLimite(sc.nextBigDecimal());
					listaContas.add(contaCrt);
				}
				else if(aux1== 2){
					ContaPoupanca contaPp = new ContaPoupanca();
					System.out.println("digite o numero da conta");
					contaPp.setNumeroConta(sc.next());
					System.out.println("digite o saldo");
					contaPp.depositar(sc.nextBigDecimal());
					System.out.println("digite o nome do cliente");
					contaPp.setCliente(sc.nextLine());
					sc.nextLine();
					System.out.println("digite os dias de rendimento");
					contaPp.setDiaRendimento(sc.nextInt());
					listaContas.add(contaPp);
				}
				else {
					ContaInvestimento contaCrt = new ContaInvestimento(); 
					System.out.println("digite o numero da conta");
					contaCrt.setNumeroConta(sc.next());
					System.out.println("digite o saldo");
					contaCrt.depositar(sc.nextBigDecimal());
					System.out.println("digite o nome do cliente");
					contaCrt.setCliente(sc.nextLine());
					sc.nextLine();
					listaContas.add(contaCrt);
				}
				
				break;
				
			case 2:
				System.out.println("digite o numero da conta");
				String info = sc.next();
				for(ContaBancaria cb: listaContas ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info)) {
						System.out.println("quanto deseja sacar?");
						BigDecimal saque = sc.nextBigDecimal();
						cb.saque(saque);
					}
				}
				break;
				
			case 3:
				System.out.println("digite o numero da conta poupança");
				String info2 = sc.next();
				for(ContaBancaria cb: listaContas ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info2)) { 
						if(cb instanceof ContaPoupanca) {
							System.out.println("qual foi o rendimento?");
							BigDecimal rendimento = sc.nextBigDecimal();
							((ContaPoupanca)cb).calcularNovosaldo(rendimento);
						}
						else {
							System.out.println("A conta informada não é poupança");
						}
					}
				}
				
				break;
				
			case 4:
				System.out.println("digite o numero da conta");
				String info3 = sc.next();
				for(ContaBancaria cb: listaContas ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info3)) {
						System.out.println("quanto deseja depositar?");
						BigDecimal deposito = sc.nextBigDecimal();
						cb.depositar(deposito);;
					}
				}
				break;
				
			case 5:
				System.out.println("digite o numero da conta");
				String info4 = sc.next();
				for(ContaBancaria cb: listaContas ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info4)) {
						System.out.printf("O valor na conta é: ");
						System.out.println(cb.getSaldo());
					}
				}
				break;
				
			case 6:
				System.out.println("digite o numero da conta");
				String info5 = sc.next();
				for(ContaBancaria cb: listaContas ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info5)) {
						if(cb instanceof ContaInvestimento ) {
							System.out.println("Qual o valor do rendimento?");
							BigDecimal rendimento = sc.nextBigDecimal();
							System.out.printf("O valor dos tributos é: ");
							System.out.println(((ContaInvestimento)cb).calcularTributo(rendimento));
						}
						else{
								System.out.println("a Conta informada não é uma conta investimento");
						}
					}
				}
				
				break;
			case 7:
				System.out.println("digite o numero da conta");
				String info6 = sc.next();
				for(ContaBancaria cb: listaContas ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info6)) {
						if(cb instanceof ContaInvestimento ) {
							System.out.println("Qual o valor do rendimento?");
							double rendimento = sc.nextDouble();
							System.out.printf("O valor dos tributos é: ");
							System.out.println(((ContaInvestimento)cb).calcularTaxaAdministração(rendimento));
						}
						else {
							System.out.println("a Conta informada não é uma conta investimento");
						}
					}
				}
				break;
		}
			System.out.printf("Escolha o que irá fazer agora: %n 1-cadastrar conta %n 2-saque de valor %n 3-atualizar a conta poupança com seu rendimento%n 4-depositar valor %n 5-mostrar o saldo da conta%n 6-Calcular os tributos de uma conta %n 7-Calcula a taxa de administração de uma conta investimento%n%n  digite 0 para sair do programa");
			opt = sc.nextInt();
	}
		sc.close();
	}
}
