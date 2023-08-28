import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite seu nome e cpf");
		String nome = sc.next();
		int cpf = sc.nextInt();
		Pessoas marcos = new Pessoas(nome,cpf);
		Pessoas bruno = new Pessoas("bruno",123);
		Porta porta = new Porta();
		porta.attach(marcos);
		porta.attach(bruno);
		boolean aberto;
		System.out.println("a porta esta aberta? true para sim false para nao");
		aberto = sc.nextBoolean();
		if (aberto == true) {
			porta.Notify();
		}
		sc.close();
	}

}
