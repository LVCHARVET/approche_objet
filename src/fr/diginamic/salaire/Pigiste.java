package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	
	int jourTravaille;
	double salaire;

	public Pigiste(String nom, String prenom, int jourTravaille, double salaire) {
		super(nom, prenom);
		this.jourTravaille = jourTravaille;
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {		
		return jourTravaille * salaire;
	}

}
