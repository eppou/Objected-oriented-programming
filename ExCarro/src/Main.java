import java.util.Scanner;

public class Main {
	public static void main(String Args[]) {
		Scanner input = new Scanner (System.in);
		Car carro = new Car();
		
		System.out.println("qual o modelo do carro?");
		String modelo = input.nextLine();
		carro.setModel(modelo);
		
		System.out.println("qual a marca do carro?");
		String marca = input.nextLine();
		carro.setMarca(marca);
		
		System.out.println("qual a velocidade do carro?");
		float velocidade = input.nextFloat();
		carro.setSpeed(velocidade);
		
		System.out.printf("%nmarca: %s modelo: %s velocidade: %s marcha: %s",marca,modelo,velocidade,carro.getMarch());
		
		input.close();
	}
}
