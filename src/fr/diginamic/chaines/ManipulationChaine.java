package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		String chaine = "Durand;Marcel;2 523.5";
		char firstCarac = chaine.charAt(0);
		System.out.println(firstCarac);
		int longeurChaine = chaine.length();
		System.out.println(longeurChaine);
		int indexChaine = chaine.indexOf(';');
		System.out.println(indexChaine);
		int D = chaine.indexOf('D');
		int d = chaine.indexOf('d');
		System.out.println(D);
		System.out.println(d);
		String nomDeFamille = chaine.substring(D, d + 1);
		System.out.println(nomDeFamille);
		System.out.println(nomDeFamille.toUpperCase());
		System.out.println(nomDeFamille.toLowerCase());
		String[] chaineSplit = chaine.split(";");		

		for (int i = 0; i < chaineSplit.length; i++) {
			String nom = chaineSplit[0];
			String prenom = chaineSplit[1];
			String salaire = chaineSplit[2];
			salaire = salaire.replace(" ", "");
			double salaireDouble = Double.parseDouble(salaire);
			Salarie salarie = new Salarie(nom, prenom, salaireDouble);
			System.out.println(salarie);
		}
	}
}
