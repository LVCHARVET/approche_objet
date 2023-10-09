package fr.diginamic.banque.entites;

public class TestBanque {

	public static void main(String[] args) {
		Compte[] arrayCompte;

		arrayCompte = new Compte[2];
		arrayCompte[0] = new Compte(123456, 2000.20);
		arrayCompte[1] = new CompteTaux(223456, 2222.22, 2);

		for (Compte comptes : arrayCompte) {
			System.out.println(comptes);
		}

	}

}
