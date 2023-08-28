import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Equipamento maquina = new Equipamento();
		EquipamentoSonoro CaixaDeSom = new EquipamentoSonoro();
		Scanner sc = new Scanner(System.in);
		int codigo = 1;
		
		while(codigo == 1) {
			System.out.printf("deseja altera qual equipamento? %n1-maquina%n2-caixa de som");
			int caso = sc.nextInt();
			
			if(caso == 1) {
				System.out.println("se deseja ligar a maquina aperte 1 se deseja desligar aperte 2");
				int liga = sc.nextInt();
				if(liga == 1) {
					maquina.liga();
				}
				else {
					maquina.desliga();
				}
			}
			
			if(caso == 2) {
				System.out.println("se deseja ligar a caixa de som aperte 1 se deseja desligar aperte 2");
				int liga = sc.nextInt();
				if(liga == 1) {
					CaixaDeSom.liga();
				}
				else {
					CaixaDeSom.desliga();
				}
				
				System.out.println("deseja alterar o som? 1-sim e em seguida digite o volume 2-nao");
				liga = sc.nextInt();
				short volume = sc.nextShort();
				if(liga==1) {
					CaixaDeSom.setVolume(volume);
				}
				
				System.out.println("qual o mode de som deseja? 1-stereo 2-mono");
				liga = sc.nextInt();
				if(liga ==1) {
					CaixaDeSom.stereo();
				}
				if(liga ==2) {
					CaixaDeSom.mono();
				}
				
			}
			System.out.println("fim do programa?");
			codigo = sc.nextInt();
		}
		sc.close();
	}
}
