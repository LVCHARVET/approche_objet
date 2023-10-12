package maps;

import java.util.HashMap;
import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		HashMap<String, Ville> mapVilles = new HashMap<>();

		mapVilles.put("Nice", new Ville("Nice", 343000));
		mapVilles.put("Carcassonne", new Ville("Carcassonne", 47800));
		mapVilles.put("Narbonne", new Ville("Narbonne", 53400));
		mapVilles.put("Lyon", new Ville("Lyon", 484000));
		mapVilles.put("Foix", new Ville("Foix", 9700));
		mapVilles.put("Pau", new Ville("Pau", 77200));
		mapVilles.put("Marseille", new Ville("Marseille", 850700));
		mapVilles.put("Tarbes", new Ville("Tarbes", 40600));

		int minHab = Integer.MAX_VALUE;
		Ville villeMinHab = null;
		for (Ville villes : mapVilles.values()) {
			if (villes.getNbHabitants() < minHab) {
				villeMinHab = villes;
				minHab = villes.getNbHabitants();
			}
		}
		System.out.println(villeMinHab);
		mapVilles.remove(villeMinHab.getNom());
		
		System.out.println("-------------");

		for (Ville villes : mapVilles.values()) {
			System.out.println(villes);
		}
	}
}
