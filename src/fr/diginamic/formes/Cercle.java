package fr.diginamic.formes;

public class Cercle extends Forme {
	
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculerSurface() {
		double perimetre = (this.rayon * 2) * 3.14;
		return perimetre;
	}

	@Override
	public double calculerPerimetre() {
		double surface = (this.rayon * this.rayon) * 3.14;
		return surface;

	}

}
