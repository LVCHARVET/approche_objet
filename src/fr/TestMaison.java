package fr;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

	public static void main(String[] args) {
		Maison chili = new Maison(5);
		
		chili.ajouterPiece(new Chambre(13, 1));
		chili.ajouterPiece(new Cuisine(20, 0));
		chili.ajouterPiece(new Salon(33, 0));
		chili.ajouterPiece(new SalleDeBain(12, 1));
		chili.ajouterPiece(new WC(5, 0));
		chili.ajouterPiece(new WC(5, 1));
		
		System.out.println(chili.calculSuperficie());
		
		System.out.println(chili.calculSuperficieEtage(0));
		
		
		
		System.out.println(chili.superficieTypePiece("WC"));
		System.out.println(chili.nombrePiece("WC"));
		
		

	}

}
