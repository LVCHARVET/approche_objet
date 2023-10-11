package maps;

public class Employe {
	String nom;
	int salaire;

	public Employe(String nom, int salaire) {
		super();
		this.nom = nom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", salaire=" + salaire + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

}
