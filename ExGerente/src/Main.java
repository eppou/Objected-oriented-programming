import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("digite o nome  do gerente");
		Gerente gerente = new Gerente();
		gerente.nome = sc.nextLine();
		System.out.println("digite o salario do gerente:");
		gerente.salario = sc.nextDouble();
		System.out.println("digite a variação desejada para alterar  o salario");
		double var = sc.nextDouble();
		gerente.aumentoSalario(var);
		System.out.printf("%n salario atual = %f%n", gerente.salario);
		
		System.out.println("deseja aumentar o salario (forma padrão)?");
		boolean flag = sc.nextBoolean();
		if(flag == true) {
		gerente.aumentoSalario();
		}
		
		System.out.printf("%n %s %f", gerente.nome , gerente.salario);
		
		sc.close();
	}

}
