package listes;

import java.util.Objects;

public class Ville implements Comparable<Ville> {
	String nom;
	int nbHabitants;

	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nbHabitants, nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ville)) {
			return false;
		}
		Ville other = (Ville) obj;
		return Objects.equals(nom, other.getNom()) && nbHabitants == other.getNbHabitants();
	}

	@Override
	public int compareTo(Ville p) {
		return 0;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", nbHabitants=" + nbHabitants + "]";
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

}
