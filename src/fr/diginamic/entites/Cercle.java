package fr.diginamic.entites;

public class Cercle {
	double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double getPerimetre() {
		double perimetre = (this.rayon * 2) * 3.14;
		return perimetre;
	}

	public double getSurface() {
		double surface = (this.rayon * this.rayon) * 3.14;
		return surface;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

}
