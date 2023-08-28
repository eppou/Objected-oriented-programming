import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ListaFila ListaFila1 = new ListaFila();
		Scanner sc = new Scanner(System.in);
		int caso = 32;
		
		while(caso!=0) {
			System.out.printf("digite a operação desejada %n1:entrar%n2:sair%n3:atender%n4:buscar%n5:imprimir%n0 para fechar o program%n%n");
			caso = sc.nextInt();
			
			switch (caso) {
			
			case 1:
				System.out.println("digite o nome de quem vai entrar na fila:");
				String nome = sc.next();
				ListaFila1.Entrar(nome);
			break;
			
			case 2:
				System.out.println("digite o nome de quem vai sair da fila:");
				String nome2 = sc.next();
				ListaFila1.Sair(nome2);
			break;
			
			case 3:
				System.out.println("atendendo cliente");
				String atendido;
				atendido = ListaFila1.Atender();
				System.out.printf("%n %s for atendido %n",atendido);
			break;
			
			case 4:
				System.out.println("digite o nome de quem voce quer buscar");
				String nome3;
				nome3 = sc.next();
				ListaFila1.Buscar(nome3);
			break;
			
			case 5:
				System.out.println("imprimindo fila");
				ListaFila1.Imprimir();
			break;
			
			default:
			
			}
		
		}
		sc.close();
	}
}
