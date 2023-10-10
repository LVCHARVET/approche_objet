package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		CalculMoyenne moy1 = new CalculMoyenne();
		
		moy1.addDouble(5);
		moy1.addDouble(10);
		moy1.addDouble(15);
		moy1.addDouble(20);
		moy1.addDouble(25);
		moy1.addDouble(5);
		moy1.addDouble(10);
		moy1.addDouble(15);
		moy1.addDouble(20);
		moy1.addDouble(25);
		moy1.addDouble(5);
		moy1.addDouble(10);
		moy1.addDouble(15);
		moy1.addDouble(20);
		moy1.addDouble(25);
		
		System.out.println(moy1);
		
		System.out.println(moy1.calculMoy());
		
	}

}
