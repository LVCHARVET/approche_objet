package fr.diginamic.essais;

import fr.diginamic.salaire.Salarie;
import fr.diginamic.salaire.Pigiste;

public class TestIntervenant {

	public static void main(String[] args) {

		Salarie salarie1 = new Salarie("Louis-Valentin", "Charvet", 1555);
		Pigiste pigiste1 = new Pigiste("Marion", "Remaud", 22, 115);

		System.out.println(salarie1.getSalaire());
		System.out.println(pigiste1.getSalaire());

		salarie1.afficherDonnees();
		pigiste1.afficherDonnees();

	}

}
