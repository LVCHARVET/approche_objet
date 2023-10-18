package listes;

import java.util.ArrayList;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		ArrayList<Ville> arrayVille = new ArrayList<>();

		arrayVille.add(new Ville("New York", 343000, Continent.AMERIQUE));
		arrayVille.add(new Ville("Paris", 47800, Continent.EUROPE));
		arrayVille.add(new Ville("Pékin", 53400, Continent.ASIE));
		arrayVille.add(new Ville("Moscou", 484000, Continent.EUROPE));
		arrayVille.add(new Ville("Berlin", 9700, Continent.EUROPE));
		arrayVille.add(new Ville("Sydney", 77200, Continent.OCEANIE));
		arrayVille.add(new Ville("Sao Paulo", 850700, Continent.AMERIQUE));
		arrayVille.add(new Ville("Dakar", 40600, Continent.AFRIQUE));

		for (Ville villes : arrayVille) {
			System.out.println(villes);
		}
	}

}
