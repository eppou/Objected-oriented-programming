import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Principal {

	public static void main(String[] args) {
		int[] vetor = {0,1,2,3,4,5,6,7,8,9};
		List<Integer> lista = new ArrayList<Integer>();
		
		for (int number: vetor ) {
			lista.add(number); 
		}
		
		List<Integer> listaReversa = new ArrayList<Integer>();
		ListIterator<Integer> iterator = lista.listIterator(lista.size());
		
		while(iterator.hasPrevious()) {
			listaReversa.add(iterator.previous());
		}
		 
		ListIterator<Integer> Printiterator1 = lista.listIterator(lista.size());
		ListIterator<Integer> Printiterator2 = listaReversa.listIterator(lista.size());

		while(Printiterator1.hasPrevious() == true) {
			System.out.printf(" %d",Printiterator1.previous());
		}
		
		while(Printiterator2.hasPrevious() == true) {
			System.out.printf(" %d",Printiterator2.previous());
		}

	}

}
