package fr.diginamic.testenumeration;

import java.util.Scanner;

public class TestEnumeration {

	public static void main(String[] args) {
		Saison ete = Saison.valueOf("ETE");
		System.out.println(ete.getLibelle());

		String libelle = "Hiver";
		Saison saisonHiver = Saison.getSaisonByLibelle(libelle);
		if (saisonHiver != null) {
			System.out.println("La saison avec le libellé " + libelle + " est : " + saisonHiver.name());
		} else {
			System.out.println("Aucune saison trouvée avec le libellé " + libelle);
		}
		
		for (Saison saisons : Saison.values()) {
			System.out.println(saisons.getOrdre() + " " + saisons);
		}

		Scanner scanner = new Scanner(System.in);
		String choix = null;

		System.out.print("Veuillez choisir une option : ");
		choix = scanner.next();

		for (Saison saisons : Saison.values()) {
			if (choix.equals(saisons.name())) {
				System.out.println("Saison : " + saisons + " Ordre : " + saisons.getOrdre() + " Libelle : "
						+ saisons.getLibelle());

			}
		}
		scanner.close();

	}

}
