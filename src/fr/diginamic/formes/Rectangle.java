package fr.diginamic.formes;

public class Rectangle extends Forme {
	
	double longueur;
	double largeur;
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		double surface = this.longueur * this.largeur;
		return surface;

	}

	@Override
	public double calculerPerimetre() {
		double perimetre = (this.longueur + this.largeur) * 2;
		return perimetre;

	}

}
