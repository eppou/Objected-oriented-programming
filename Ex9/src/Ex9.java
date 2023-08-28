import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o seu peso?");
		double peso = sc.nextDouble();
		System.out.println("Qual a sua Altura?");
		double altura = sc.nextDouble();
		double IMC = peso / (altura*altura);
		System.out.printf("%nseu IMC é: %.2f", IMC);
		
	}
}
