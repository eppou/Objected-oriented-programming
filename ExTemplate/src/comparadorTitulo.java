import java.util.ArrayList;

public class comparadorTitulo extends Musica {
	protected void sort(ArrayList<song> playlist2) {
		for (song msc1: playlist2) {
		   	   for (song msc2: playlist2) {
				// comparing adjacent strings
				if (msc1.nome.compareTo(msc2.nome) < 0) {
					song temp = msc2;
					msc2 = msc1;
					msc1 = temp;
				}
			   }
			}
	}
}
