import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList <ContaCorrente> listaContasC = new ArrayList <ContaCorrente> ();
		ArrayList <ContaPoupança> listaContasP = new ArrayList <ContaPoupança> ();
		ArrayList <ContaInvestimento> listaContasI = new ArrayList <ContaInvestimento> ();
		System.out.printf("Escolha o que irá fazer agora: %n 1-cadastrar conta %n 2-saque de valor %n 3-atualizar a conta poupança com seu rendimento%n 4-depositar valor %n 5-mostrar o saldo da conta%n 6-Calcular os tributos de uma conta %n 7-Calcula a taxa de administração de uma conta investimento%n%n  digite 0 para sair do programa");
		int opt = sc.nextInt();
		
		while(opt != 0){
			
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
					listaContasC.add(contaCrt);
				}
				else if(aux1== 2){
					ContaPoupança contaPp = new ContaPoupança();
					System.out.println("digite o numero da conta");
					contaPp.setNumeroConta(sc.next());
					System.out.println("digite o saldo");
					contaPp.depositar(sc.nextBigDecimal());
					System.out.println("digite o nome do cliente");
					contaPp.setCliente(sc.nextLine());
					sc.nextLine();
					System.out.println("digite os dias de rendimento");
					contaPp.setDiaRendimento(sc.nextInt());
					listaContasP.add(contaPp);
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
					listaContasI.add(contaCrt);
				}
				
				break;
				
			case 2:
				System.out.println("digite o numero da conta");
				String info = sc.next();
				for(ContaCorrente cb: listaContasC ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info)) {
						System.out.println("quanto deseja sacar?");
						BigDecimal saque = sc.nextBigDecimal();
						cb.sacar(saque);
					}
				}
				
				for(ContaPoupança cb: listaContasP ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info)) {
						System.out.println("quanto deseja sacar?");
						BigDecimal saque = sc.nextBigDecimal();
						cb.sacar(saque);
					}
				}
				
				for(ContaInvestimento cb: listaContasI ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info)) {
						System.out.println("quanto deseja sacar?");
						BigDecimal saque = sc.nextBigDecimal();
						cb.sacar(saque);
					}
				}
				
				break;
				
			case 3:
				System.out.println("digite o numero da conta poupança");
				String info2 = sc.next();
				for(ContaPoupança cb: listaContasP ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info2)) { 
						System.out.println("qual foi o rendimento?");
						BigDecimal rendimento = sc.nextBigDecimal();
						cb.calcularNovosaldo(rendimento);
					}
				}
				
				break;
				
			case 4:
				System.out.println("digite o numero da conta");
				String info3 = sc.next();
				for(ContaCorrente cb: listaContasC ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info3)) {
						System.out.println("quanto deseja sacar?");
						BigDecimal deposito = sc.nextBigDecimal();
						cb.depositar(deposito);;
					}
				}
				
				for(ContaPoupança cb: listaContasP ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info3)) {
						System.out.println("quanto deseja sacar?");
						BigDecimal deposito = sc.nextBigDecimal();
						cb.depositar(deposito);
					}
				}
				
				for(ContaInvestimento cb: listaContasI ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info3)) {
						System.out.println("quanto deseja sacar?");
						BigDecimal deposito = sc.nextBigDecimal();
						cb.depositar(deposito);
					}
				}
				
				break;
				
			case 5:
				System.out.println("digite o numero da conta");
				String info4 = sc.next();
				for(ContaCorrente cb: listaContasC ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info4)) {
						System.out.printf("O valor na conta é: ");
						System.out.println(cb.getSaldo());
					}
				}
				
				for(ContaPoupança cb: listaContasP ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info4)) {
						System.out.printf("O valor na conta é: ");
						System.out.println(cb.getSaldo());
					}
				}
				
				for(ContaInvestimento cb: listaContasI ) {
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
				for(ContaInvestimento cb: listaContasI ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info5)) {
						System.out.println("Qual o valor do rendimento?");
						BigDecimal rendimento = sc.nextBigDecimal();
						System.out.printf("O valor dos tributos é: ");
						System.out.println(cb.calcularTributo(rendimento));
					}
				}
				
				break;
				
			case 7:
				System.out.println("digite o numero da conta");
				String info6 = sc.next();
				for(ContaInvestimento cb: listaContasI ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info6)) {
						System.out.println("Qual o valor do rendimento?");
						double rendimento = sc.nextDouble();
						System.out.printf("O valor dos tributos é: ");
						System.out.println(cb.calcularTaxaAdministração(rendimento));
					}
				}
				break;
				
			default:
				break;
			}
			System.out.printf("Escolha o que irá fazer agora: %n 1-cadastrar conta %n 2-saque de valor %n 3-atualizar a conta poupança com seu rendimento%n 4-depositar valor %n 5-mostrar o saldo da conta%n 6-Calcular os tributos de uma conta %n 7-Calcula a taxa de administração de uma conta investimento%n%n  digite 0 para sair do programa");
			opt = sc.nextInt();
		}
		sc.close();
	}
}
