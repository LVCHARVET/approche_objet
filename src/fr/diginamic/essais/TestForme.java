package fr.diginamic.essais;
import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {
		Cercle form1 = new Cercle(20);
		Carre form2 = new Carre(10,10);
		Rectangle form3 = new Rectangle(20, 30);
		
		System.out.println("Cercle : ");
		AffichageForme.afficher(form1);
		System.out.println("Carre : ");
		AffichageForme.afficher(form2);
		System.out.println("Rectangle : ");
		AffichageForme.afficher(form3);

	}

}
