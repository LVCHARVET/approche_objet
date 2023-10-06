package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adressePostale;

	public Personne(String name, String firstName, AdressePostale adrPost) {
		nom = name;
		prenom = firstName;
		adressePostale = adrPost;
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adressePostale=" + adressePostale + "]";
	}

	public void affichage() {
		System.out.println(this.nom.toUpperCase());
		System.out.println(this.prenom.toUpperCase());
	}
	
	public void modifNom(String modNom) {
		this.nom = modNom;
	}
	
	public void modifPrenom(String modPrenom) {
		this.prenom = modPrenom;
	}
	
	public void modifAdresse(AdressePostale modAdrPos) {
		this.adressePostale = modAdrPos;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public AdressePostale getAdressePostale() {
		return this.adressePostale;
	}
}
