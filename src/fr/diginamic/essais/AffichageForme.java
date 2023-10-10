package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static void afficher(Forme forme) {
		System.out.println("Périmétre : " + forme.calculerPerimetre());
		System.out.println("Surface : " + forme.calculerSurface());

	}

}
