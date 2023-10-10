package fr.diginamic.operations;

public class Operations {

	static double resultat;

	public static double calcul(double a, double b, char operateur) {
		if (operateur == '+') {
			resultat = a + b;
		} else if (operateur == '-') {
			resultat = a - b;
		} else if (operateur == '*') {
			resultat = a * b;
		} else if (operateur == '/') {
			resultat = a / b;
		}
		return resultat;
	}
}
