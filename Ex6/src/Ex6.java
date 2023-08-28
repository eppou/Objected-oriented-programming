import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner n = new Scanner (System.in);
		System.out.println("Qual o nivel de triangulo que voce deseja?");
		int a = n.nextInt();
		
		for(int i=1;i<=a;i++) {
			System.out.println();
			for (int i2=0;i2<i;i2++) {
				System.out.print("*");
			}
		}
		
		n.close();
		
	}
}
