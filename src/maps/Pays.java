package maps;

public class Pays {
	String nom;
	int nbHabitant;
	String continent;

	public Pays(String nom, int nbHabitant, String continent) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHabitant=" + nbHabitant + ", continent=" + continent + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
