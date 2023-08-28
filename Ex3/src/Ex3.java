import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		System.out.println("numero de vezes que deseja imprimir seu nome:");
        int a = numero.nextInt();
        
        System.out.println("seu nome:");
        String nome = numero.next();
        
        System.out.printf ("executando... %n");
        
		for (int i=0; i<a; i++) {
			System.out.println (nome);
		}
		numero.close();
	}

}
