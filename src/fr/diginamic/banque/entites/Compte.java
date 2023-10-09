package fr.diginamic.banque.entites;

public class Compte {
	public int numCompte;
	public double solCompte;

	public Compte(int numCompte, double solCompte) {
		this.numCompte = numCompte;
		this.solCompte = solCompte;
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", solCompte=" + solCompte + "]";
	}

	public int getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(int numCompte) {
		this.numCompte = numCompte;
	}

	public double getSolCompte() {
		return solCompte;
	}

	public void setSolCompte(double solCompte) {
		this.solCompte = solCompte;
	}

}
