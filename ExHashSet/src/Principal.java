import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Digite uma frase:");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		String frase_nova = removePonctuation(frase);
		String[] palavras = frase_nova.split("\\W");
		
		Map<String, Integer> word_map = new HashMap<>();
		
		for(String palavra: palavras) {
			
			if (word_map.get(palavra) != null) {
                word_map.put(palavra, word_map.get(palavra) + 1);
            }
  
            else {
                word_map.put(palavra, 1);
            }
		}
	
        Set<String> word_set = word_map.keySet();
        System.out.println("palavras repetidas: ");
        int n = 0;
        for (String word : word_set) {
  
            if (word_map.get(word) > 1) {System.out.println(frase_nova);
                System.out.println(word);
                n++;
            }
        }
        System.out.println("numero de palavras repetidas: "+ n);
		sc.close();
	}
	
	public static String removePonctuation(String s) {
		String strippedInput = s.replaceAll("\\W", " ");
		return strippedInput;
	}

}
