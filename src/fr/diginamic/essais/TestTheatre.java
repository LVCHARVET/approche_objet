package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre theatre1 = new Theatre("Flot Bleu", 5);
		
		theatre1.inscrire(3, 5);
		System.out.println(theatre1.getRecette());
		System.out.println(theatre1.getClient());
		theatre1.inscrire(3, 5);
		System.out.println(theatre1.getRecette());
		System.out.println(theatre1.getClient());

	}

}
