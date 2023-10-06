package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		Personne per1 = new Personne();
		Personne per2 = new Personne();
		AdressePostale adr1 = new AdressePostale();
		AdressePostale adr2 = new AdressePostale();
		
		adr1.numeroRUE = 1;
		adr1.libelleRue = "rue de bleu";
		adr1.codePostal = 69100;
		adr1.ville = "Villeurbanne";
		
		adr2.numeroRUE = 2;
		adr2.libelleRue = "rue de bleu";
		adr2.codePostal = 69200;
		adr2.ville = "Villeurbanne";
		
		per1.nom = "CHARVET";
		per1.prenom = "Louis-Valentin";
		per1.adressePostale = adr1;
		
		per2.nom = "REMAUD";
		per2.prenom = "Marion";
		per2.adressePostale = adr2;
		

	}

}
