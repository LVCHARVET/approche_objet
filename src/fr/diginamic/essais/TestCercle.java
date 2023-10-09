package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		Cercle cercle1 = new Cercle(8);
		Cercle cercle2 = new Cercle(9);
		Cercle cercle3 = CercleFactory.createCercle(10);

		System.out.println(cercle1.getPerimetre());
		System.out.println(cercle1.getSurface());
		System.out.println(cercle2.getPerimetre());
		System.out.println(cercle2.getSurface());
		System.out.println(cercle3.getPerimetre());
		System.out.println(cercle3.getSurface());
	}

}
