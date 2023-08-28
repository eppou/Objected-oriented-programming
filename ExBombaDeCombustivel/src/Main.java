import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bomba bomb = new Bomba();
		Scanner sc = new Scanner(System.in);
		System.out.printf("menu: %n 1:adicionar combustivel a bomba %n 2:abastecer em litros %n 3:abastecer em dinheiro");
		int menu = sc.nextInt();
		
		switch(menu) {
		
		case 1:
			System.out.println("digite o preço do combustivel");
			float preço = sc.nextFloat();
			System.out.println("digite a quantidade de combustivel que vai estar disponivel");
			float litros = sc.nextFloat();
			System.out.println("digite o tipo de combustivel");
			String tipo = sc.next();
			bomb.adicionarCombustivel(preço, litros, tipo);
			
			break;
			
		case 2:
			System.out.println("quantos litros deseja abastecer?");
			float litro = sc.nextFloat();
			System.out.println("qual o indice do combustivel que vc deseja abastecer?");
			int i = sc.nextInt();
			bomb.abastecerEmLitros(litro, i);
			
			break;
		
		case 3:
			System.out.println("quantos reais deseja abastecer?");
			float dindin = sc.nextFloat();
			System.out.println("qual o indice do combustivel que vc deseja abastecer?");
			int ind = sc.nextInt();
			bomb.abastecerEmDinheiro(dindin, ind);
			
			break;
			
		default:
			break;
		}
		sc.close();
	}

}
