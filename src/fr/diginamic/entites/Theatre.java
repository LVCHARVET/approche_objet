package fr.diginamic.entites;

public class Theatre {
	String nom;
	int nbPers;
	int client;
	double recette;

	public Theatre(String nom, int nbPers) {
		this.nom = nom;
		this.nbPers = nbPers;
		this.client = 0;
		this.recette = 0.0;
	}

	public void inscrire(int nbClient, int prix) {
		if (client + nbClient >= nbPers) {
			System.out.println("Capacité maximal atteinte");
		} else {
			client = client + nbClient;
			recette = recette + (nbClient * prix);
		}
	}

	@Override
	public String toString() {
		return "Theatre [nom=" + nom + ", nbPers=" + nbPers + ", client=" + client + ", recette=" + recette + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbPers() {
		return nbPers;
	}

	public void setNbPers(int nbPers) {
		this.nbPers = nbPers;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public double getRecette() {
		return recette;
	}

	public void setRecette(int recette) {
		this.recette = recette;
	}
}
