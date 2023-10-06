package entites;

public class TestAdressePostale {

	public static void main(String[] args) {

		AdressePostale adr1 = new AdressePostale(1, "rue de bleu", 69100, "Villeurbanne");
		AdressePostale adr2 = new AdressePostale(2, "rue de bleu", 69200, "Villeurbanne");

		adr1.numeroRUE = 1;
		adr1.libelleRue = "rue de bleu";
		adr1.codePostal = 69100;
		adr1.ville = "Villeurbanne";

		adr2.numeroRUE = 2;
		adr2.libelleRue = "rue de bleu";
		adr2.codePostal = 69200;
		adr2.ville = "Villeurbanne";
	}

}
