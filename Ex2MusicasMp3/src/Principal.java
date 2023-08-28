import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		
		TreeSet<MusicaMP3> musicas = 
				new TreeSet<MusicaMP3>();
		
		do {
			
			System.out.println("Digite a sua op��o");
			System.out.println("1- Adicionar m�sica");
			System.out.println("2- Ordenar m�sica por t�tulo");
			System.out.println("3- Ordenar m�sica por artista");
			System.out.println("4- Buscar m�sica por t�tulo");
			System.out.println("5- Buscar m�sica por artista");
			System.out.println("6- Embaralhar lista de m�sicas");
			System.out.println("7- Sair");
			
			
			opcao = sc.nextInt();
			
			sc.nextLine();
			
			switch (opcao) {
			
			case 1:
				System.out.println("Digite o t�tulo da m�sica");
				String titulo = sc.nextLine();
				System.out.println("Digite o nome do artista");
				String artista = sc.nextLine();
				MusicaMP3 novaMusica = new MusicaMP3(titulo, artista);
				musicas.add(novaMusica);
				imprimirListaMusicas(musicas);
				break;
			case 2:
				Collections.sort(musicas,
						new ComparadorMusica(
								MusicaMP3.CriterioClassificacao.TITULO));
				imprimirListaMusicas(musicas);
				break;
			case 3:
				Collections.sort(musicas,
						new ComparadorMusica(MusicaMP3.CriterioClassificacao.ARTISTA));
				imprimirListaMusicas(musicas);
				break;
			case 4:
				System.out.println("Digite o t�tulo da m�sica");
				String tituloBusca = sc.nextLine();
				MusicaMP3 musicaBusca = new MusicaMP3(tituloBusca, null);
				int posicao = 
						Collections.binarySearch(
								musicas,musicaBusca,
								new ComparadorMusica(
										MusicaMP3.CriterioClassificacao.TITULO));
				System.out.printf("A m�sica est� na posi��o %d da lista%n", posicao);
				break;
			case 5:
				System.out.println("Digite o nome do artista");
				String artistaBusca = sc.nextLine();
				musicaBusca = new MusicaMP3(null, artistaBusca);
				posicao = Collections.binarySearch(musicas,musicaBusca,
						new ComparadorMusica(MusicaMP3.CriterioClassificacao.ARTISTA));
				System.out.printf("A m�sica est� na posi��o %d da lista%n", posicao);
				break;
			case 6:
				Collections.shuffle(musicas);
				imprimirListaMusicas(musicas);
				break;
			}
			
		} while (opcao != 7);
		sc.close();
	}
	
	public static void imprimirListaMusicas(TreeSet<MusicaMP3> lista) {
		System.out.println("**********Lista de m�sicas**********");
		for (MusicaMP3 musica : lista) {
			System.out.println(musica);
		}
		System.out.println("************************************");
	}
}
