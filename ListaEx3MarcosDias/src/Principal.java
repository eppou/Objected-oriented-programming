import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList <ContaBancaria> listaContas = new ArrayList <ContaBancaria> ();
		System.out.printf("Escolha o que irá fazer agora: %n 1-cadastrar conta %n 2-saque de valor %n 3-atualizar a conta poupança com seu rendimento%n 4-depositar valor %n 5-mostrar o saldo da conta%n%n  digite 0 para sair do programa");
		int opt = sc.nextInt();
		
		while(opt != 0){
			
			switch (opt) {
				
			case 1:
				System.out.println("1-para conta corrente       2-para conta poupança");
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
				else {
					ContaPoupança contaPp = new ContaPoupança();
					System.out.println("digite o numero da conta");
					contaPp.setNumeroConta(sc.nextLine());
					System.out.println("digite o nome do cliente");
					contaPp.setCliente(sc.nextLine());
					System.out.println("digite o saldo");
					contaPp.depositar(sc.nextBigDecimal());
					System.out.println("digite os dias de rendimento");
					contaPp.setDiaDeRendimento(sc.nextInt());
					listaContas.add(contaPp);
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
						cb.sacar(saque);
					}
				}
				
				break;
				
			case 3:
				System.out.println("digite o numero da conta poupança");
				String info2 = sc.next();
				for(ContaBancaria cb: listaContas ) {
					String aux2 = cb.getNumeroConta();
					if(aux2.equals(info2)) { 
						ContaPoupança cp  = new ContaPoupança();
						cp = (ContaPoupança) cb;
						System.out.println("qual foi o rendimento?");
						BigDecimal rendimento = sc.nextBigDecimal();
						cp.calcularNovoSaldo(rendimento);
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
						cb.depositar(deposito);
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
			default:
				break;
			}
			System.out.printf("Escolha o que irá fazer agora: %n 1-cadastrar conta %n 2-saque de valor %n 3-atualizar a conta poupança com seu rendimento%n 4-depositar valor %n 5-mostrar o saldo da conta%n%n  digite 0 para sair do programa");
			opt = sc.nextInt();
		}
		sc.close();
	}
}
