import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a posição de fibonacci desejada");
		int n = sc.nextInt();
		int actual=0;
		
		if(n!=0) {
			actual = fibonacci(n);
		}
		System.out.println(actual);
		sc.close();
	}
	
	public static int fibonacci(int number){
        
        if(number <= 1 || number == 2){
            return 1;
        }
      
        return fibonacci(number-1) + fibonacci(number -2); 
    }

}
