package fichier;

public class Ville {
	String nom;
	String departement;
	String nomRegion;
	int popTotal;

	public Ville(String nom, String departement, String nomRegion, int popTotal) {
		this.nom = nom;
		this.departement = departement;
		this.nomRegion = nomRegion;
		this.popTotal = popTotal;
	}

	@Override
	public String toString() {
		return "Ville [nom=" + nom + ", departement=" + departement + ", nomRegion=" + nomRegion + ", popTotal="
				+ popTotal + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopTotal() {
		return popTotal;
	}

	public void setPopTotal(int popTotal) {
		this.popTotal = popTotal;
	}

}
