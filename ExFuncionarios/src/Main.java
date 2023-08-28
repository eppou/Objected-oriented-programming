import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o valor do vale:");
		float vali = sc.nextFloat();
		Funcionario.setVale(vali);
		
		System.out.println("digite a taxa de alteração para o vale refeição:");
		float taxa = sc.nextFloat();
		Funcionario.changeVale(taxa);
		System.out.println(Funcionario.returnVale());
		
		sc.close();
	}

}
