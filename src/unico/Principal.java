package unico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Principal {

	public static void main(String[] args) {

		String frase = "Hola que tal Hola haces que suene";

		StringTokenizer st = new StringTokenizer(frase, " ");
		List<String> palabras = new ArrayList<String>();

		while (st.hasMoreTokens()) {
			palabras.add(st.nextToken());
		}

		System.out.println("Palabras:");
		System.out.println(palabras);

		List<String> repes = new ArrayList<String>();
		List<String> noRepes = new ArrayList<String>();
		
		
		int frec;
		for (String p : palabras) {
			frec = Collections.frequency(palabras, p);
			if (frec == 1) {
				noRepes.add(p);
			} else {
				if (!repes.contains(p)) {
					repes.add(p);
				}
			}
		}
		
		/* Opción alternativa en desarrollo que funciona a medias y necesito perfeccionar
		for (int i = 0; i < palabras.size(); i++) {
			int l = 0;
			for (l = l; l < palabras.size(); l++) {
				if (palabras.get(i).equals(palabras.get(l))) {
					repes.add(palabras.get(i));
					break;
				}else {
					noRepes.add(palabras.get(i));
					break;
				}
			}
			l++;
		}
		*/
		
		System.out.println("Repetidos:");
		System.out.println(repes);
		System.out.println("No Repetidos:");
		System.out.println(noRepes);
	}
}
