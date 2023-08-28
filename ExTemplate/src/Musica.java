import java.util.ArrayList;

public abstract class Musica {
	ArrayList<song> playlist = new ArrayList<song>();
	
	

	public ArrayList<song> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ArrayList<song> playlist) {
		this.playlist = playlist;
	}

	public void OrdenaMusica() {
		sort(playlist);
	}

	protected abstract void sort(ArrayList<song> playlist2);

	@Override
	public String toString() {
		return "Musica [playlist=" + playlist + "]";
	}
	
	
}
