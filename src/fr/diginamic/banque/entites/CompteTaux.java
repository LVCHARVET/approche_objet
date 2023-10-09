package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	public int tauxRemu;

	public CompteTaux(int numCompte, double solCompte, int tauxRemu) {
		super(numCompte, solCompte);
		this.tauxRemu = tauxRemu;
	}

	@Override
	public String toString() {
		return "CompteTaux [tauxRemu=" + tauxRemu + ", " + super.toString() + "]";
	}

}
