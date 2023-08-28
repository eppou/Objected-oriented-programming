
public class Main {

	public static void main(String[] args) {
		int total=0;
		for(String number: args) {
			total += Integer.parseInt(number);
		}
		System.out.println(total);
	}  
}
