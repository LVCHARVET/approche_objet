package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import tri.ComparatorHabitant;

public class TestVilles {

	public static void main(String[] args) {
		ArrayList<Ville> arrayVille = new ArrayList<>();

		arrayVille.add(new Ville("Nice", 343000));
		arrayVille.add(new Ville("Carcassonne", 47800));
		arrayVille.add(new Ville("Narbonne", 53400));
		arrayVille.add(new Ville("Lyon", 484000));
		arrayVille.add(new Ville("Foix", 9700));
		arrayVille.add(new Ville("Pau", 77200));
		arrayVille.add(new Ville("Marseille", 850700));
		arrayVille.add(new Ville("Tarbes", 40600));
		
		Collections.sort(arrayVille, new ComparatorHabitant());

		Ville maxHab = arrayVille.get(0);
		for (Ville villes : arrayVille) {
			if (villes.getNbHabitants() > maxHab.getNbHabitants()) {
				maxHab = villes;
			}
		}

		Ville minHab = arrayVille.get(0);
		Iterator<Ville> iter = arrayVille.iterator();
		while (iter.hasNext()) {
			Ville villes = iter.next();
			if (villes.getNbHabitants() < minHab.getNbHabitants()) {
				minHab = villes;
			}
		}

		arrayVille.remove(minHab);

		for (Ville villes : arrayVille) {
			if (villes.getNbHabitants() > 100000) {
				villes.setNom(villes.getNom().toUpperCase());
			}
			System.out.println(villes);
		}

	}

}
