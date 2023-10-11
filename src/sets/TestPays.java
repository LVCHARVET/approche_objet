package sets;

import java.util.HashSet;

public class TestPays {

	public static void main(String[] args) {
		HashSet<Pays> arrayPays = new HashSet<>();

		arrayPays.add(new Pays("USA", 331002651, 65063));
		arrayPays.add(new Pays("France", 65273511, 41463));
		arrayPays.add(new Pays("Allemagne", 83783942, 47361));
		arrayPays.add(new Pays("UK", 67886011, 39758));
		arrayPays.add(new Pays("Italie", 60461826, 34483));
		arrayPays.add(new Pays("Japon", 126476461, 39474));
		arrayPays.add(new Pays("Chine", 1439323776, 10261));
		arrayPays.add(new Pays("Russie", 145934462, 11225));
		arrayPays.add(new Pays("Inde", 1380004385, 2104));

		double maxPibHab = 0.0;
		Pays paysMaxPibHab = null;

		for (Pays pays : arrayPays) {
			if (pays.getPibParHab() > maxPibHab) {
				maxPibHab = pays.getPibParHab();
			}
		}
		for (Pays pays : arrayPays) {
			if (pays.getPibParHab() == maxPibHab) {
				paysMaxPibHab = pays;
			}
		}
		System.out.println(paysMaxPibHab);

		double maxPib = 0.0;
		Pays paysMaxPib = null;

		for (Pays pays : arrayPays) {
			if (pays.getPibTotal() > maxPib) {
				maxPib = pays.getPibTotal();
			}
		}
		for (Pays pays : arrayPays) {
			if (pays.getPibTotal() == maxPib) {
				paysMaxPib = pays;
			}
		}
		System.out.println(paysMaxPib);

		double minPib = Double.MAX_VALUE;
		Pays paysMinPib = null;

		for (Pays pays : arrayPays) {
			if (pays.getPibTotal() < minPib) {
				minPib = pays.getPibTotal();
			}
		}
		for (Pays pays : arrayPays) {
			if (pays.getPibTotal() == minPib) {
				paysMinPib = pays;
			}
		}
		paysMinPib.nom.toUpperCase();
		System.out.println(paysMinPib);
		arrayPays.remove(paysMinPib);
		System.out.println("---------------------");
		for (Pays pays : arrayPays) {
			System.out.println(pays + "PIB Total : " + pays.getPibTotal());
		}

	}

}
