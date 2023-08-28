
public class Main {
		public static void main(String[] args) {
			int a = 2;
			int b=6;
			System.out.println(Main.potencia(a, b));
			System.out.println(Main.sla(a, b));
		}

		public static double potencia(int V1,int V2) {
			return Math.pow(V1, V2);
		}
		
		public static int sla(double V1,double V2) {
			 return Math.min((int)V1,(int) V2);
		}
}

