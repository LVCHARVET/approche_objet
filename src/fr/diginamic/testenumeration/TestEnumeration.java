package fr.diginamic.testenumeration;

import java.util.Scanner;

public class TestEnumeration {

	public static void main(String[] args) {
		for (Saison saisons : Saison.values()) {
			System.out.println(saisons.getOrdre() + " " + saisons);			
		}
		
		Scanner scanner = new Scanner(System.in);		
		String choix = null;
		
		System.out.print("Veuillez choisir une option : ");
		choix = scanner.next();
		
		for (Saison saisons : Saison.values()) {
			if (choix.equals(saisons.name())) {
				System.out.println("Saison : " + saisons + " Ordre : " + saisons.getOrdre() + " Libelle : " + saisons.getLibelle());
				
			}
		}
		scanner.close();
	}

}
