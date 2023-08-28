import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double vetor[] = new double[4];
		System.out.println(Main.product(2,3,4,5));
		System.out.println(Main.product(2,3));
		vetor[0] = 7;
		vetor[1] = 5;
		vetor[2] = 2;
		vetor[3] = 1;
		Arrays.sort(vetor);
		System.out.println(Main.product(vetor));
	}
	
	public static double product(double ... numver) {
		double total=1;
		for(int i=0;i<numver.length;i++) {
			total = total*numver[i];
		}
		return total;
	}

}
