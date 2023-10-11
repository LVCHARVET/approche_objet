package sets;

public class Pays {
	String nom;
	int nbHabitants;
	double pibParHab;

	public Pays(String nom, int nbHabitants, double pibParHab) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHab = pibParHab;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitants=" + nbHabitants + ", pibParHab=" + pibParHab + "]";
	}

	public double getPibTotal() {
		return nbHabitants * pibParHab;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitants() {
		return nbHabitants;
	}

	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	public double getPibParHab() {
		return pibParHab;
	}

	public void setPibParHab(int pibParHab) {
		this.pibParHab = pibParHab;
	}

}
