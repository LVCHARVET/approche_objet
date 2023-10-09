package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String date, int montant) {
		super(date, montant);
	}

	@Override
	public void afficherOperation(int montant) {
		System.out.println(date + montant);

	}

	@Override
	public String toString() {
		return "Credit [date=" + date + ", montant=" + montant + "]";
	}

}
