package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> arrayVille = new ArrayList<>();
		arrayVille.add("Nice");
		arrayVille.add("Carcassonne");
		arrayVille.add("Narbonne");
		arrayVille.add("Lyon");
		arrayVille.add("Foix");
		arrayVille.add("Pau");
		arrayVille.add("Marseille");
		arrayVille.add("Tarbes");

		String maxLettreVille = "";
		for (String villes : arrayVille) {
			if (villes.length() > maxLettreVille.length()) {
				maxLettreVille = villes;
			}
		}
		System.out.println(maxLettreVille);
		System.out.println("--------------------");
		for (int i = 0; i < arrayVille.size(); i++) {
			arrayVille.set(i, arrayVille.get(i).toUpperCase());
		}
		Iterator<String> iter = arrayVille.iterator();
		while (iter.hasNext()) {
			String ville = iter.next();
			if (ville.startsWith("N")) {
				iter.remove();
			}
		}

		for (String villes : arrayVille) {
			System.out.println(villes);
		}
	}

}
