import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<song> playlist = new ArrayList<song>();
		int opt =1;
		while(opt != 0) {
			System.out.println("digite em sequencia artista,nome e album ,quando n desejar adicionar outras musicas digite 0");
			opt = sc.nextInt();
			song musica = new song(sc.next(),sc.next(),sc.next());
			playlist.add(musica);
		}
		
		Musica ordenador = new comparadorTitulo();
		Musica ordenador2 = new comparadorArtista();
		
		ordenador.setPlaylist(playlist);
		ordenador2.setPlaylist(playlist);
		ordenador.OrdenaMusica();
		ordenador2.OrdenaMusica();
		ordenador.toString();
		ordenador.toString();
		sc.close();
	}

}
