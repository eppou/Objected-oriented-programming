import java.security.SecureRandom;

public class Main {

	public static void main(String[] args) {

		int count[] = new int[6];
		int vendas[] = new int[50];
		SecureRandom r = new SecureRandom();
		
		//atribuindo valores aleatorios para a venda
		for (int i=0;i<50;i++) {
			vendas[i] = r.nextInt(700);
		}
		
		//contando os valores
		for(int ii=0;ii<50;ii++) {
			
			System.out.println(vendas[ii]);
			
			if (vendas[ii]>=0&&vendas[ii]<=99) {
				count[0] = count[0] + 1;
			}
			
			if (vendas[ii]>=100&&vendas[ii]<=199) {
				count[1] = count[1] + 1;
			}
			
			if (vendas[ii]>=200&&vendas[ii]<=299) {
				count[2] = count[2] + 1;
			}
			
			if (vendas[ii]>=300&&vendas[ii]<=399) {
				count[3] = count[3] + 1;
			}
			
			if (vendas[ii]>=400&&vendas[ii]<=499) {
				count[4] = count[4] + 1;
			}
			
			if (vendas[ii]>=500) {
				count[5] = count[5] + 1;
			}
		}
		
		System.out.printf("%d %d %d %d %d %d", count[0],count[1],count[2],count[3],count[4],count[5]);
	}

}
