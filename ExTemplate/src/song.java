
public class song {
	public String artista;
	public String nome;
	public String album;

	public song(String artista, String nome, String album) {
		super();
		this.artista = artista;
		this.nome = nome;
		this.album = album;
	}

	@Override
	public String toString() {
		return "song [artista=" + artista + ", nome=" + nome + ", album=" + album + "]";
	}
	
}