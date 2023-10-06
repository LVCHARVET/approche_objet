package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale(1, "rue de bleu", 69100, "Villeurbanne");
		AdressePostale adr2 = new AdressePostale(2, "rue de bleu", 69200, "Villeurbanne");

		Personne per1 = new Personne("CHARVET", "Louis-Valentin", adr1);
		Personne per2 = new Personne("REMAUD", "Marion", adr2);
		
		String n = per1.getNom();
		System.out.println(n);
		per1.getNom();
		per1.getPrenom();
		per1.modifAdresse(adr2);
		per1.getAdressePostale();
		System.out.println(per1);
		
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
