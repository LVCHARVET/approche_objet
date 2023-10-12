package maps;

import java.util.ArrayList;
import java.util.HashMap;

public class ComptagePaysParContinent {

	public static void main(String[] args) {
		ArrayList<Pays> arrayPays = new ArrayList<Pays>();

		arrayPays.add(new Pays("France", 65000000, "Europe"));
		arrayPays.add(new Pays("Allemagne", 80000000, "Europe"));
		arrayPays.add(new Pays("Belgique", 10000000, "Europe"));
		arrayPays.add(new Pays("Russie", 150000000, "Asie"));
		arrayPays.add(new Pays("Chine", 1400000000, "Asie"));
		arrayPays.add(new Pays("Indonésie", 220000000, "Océanie"));
		arrayPays.add(new Pays("Australie", 20000000, "Océanie"));

		HashMap<String, Integer> mapPays = new HashMap<>();

		int compteurEur = 0;
		int compteurAsie = 0;
		int compteurOceanie = 0;

		for (Pays pays : arrayPays) {
			String continentPays = pays.getContinent();
			if (continentPays == "Océanie") {
				compteurOceanie++;
				mapPays.put(continentPays, compteurOceanie);
			} else if (continentPays == "Europe") {
				compteurEur++;
				mapPays.put(continentPays, compteurEur);
			} else if (continentPays == "Asie") {
				compteurAsie++;
				mapPays.put(continentPays, compteurAsie);
			}
		}

		System.out.println(mapPays);

	}
}
