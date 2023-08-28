import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o nome da pessoa");
		String nome = sc.nextLine();
		System.out.println("Insira o sobrenome da pessoa");
		String sobrenome = sc.nextLine();
		System.out.println("Insira o dia de nascimento");
		float dia = sc.nextFloat();
		System.out.println("Insira o mes de nascimento");
		float mes = sc.nextFloat();
		System.out.println("Insira o ano de nascimento");
		float ano = sc.nextFloat();
		System.out.println("Insira o dia de hoje");
		float Tdia = sc.nextFloat();
		System.out.println("Insira o mes de hoje");
		float Tmes = sc.nextFloat();
		System.out.println("Insira o ano de hoje");
		float Tano = sc.nextFloat();
		
		HeartRates pessoa = new HeartRates(nome,sobrenome,dia,mes,ano); 
		
		System.out.printf("%nNome:%s Sobrenome:%s Data de Nascimento:%.0f/%.0f/%.0f", pessoa.getNome(),pessoa.getSobrenome(),pessoa.getDia(),pessoa.getMes(),pessoa.getAno());
		
		System.out.printf("%nA idade é:%.0f%nA frequencia cardiaca maxima é %.0f e a frequencia cardiaca alvo é entre %.0f e %.0f", pessoa.descubraIdade(Tdia,Tmes,Tano),pessoa.calculaFrequenciaMaxima(Tdia, Tmes, Tano),pessoa.calculaFrequenciaAlvoInferior(Tdia, Tmes, Tano),pessoa.calculaFrequenciaAlvoSuperior(Tdia, Tmes, Tano));

		sc.close();
	}

}
