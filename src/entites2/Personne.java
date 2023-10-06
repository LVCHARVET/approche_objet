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
}
