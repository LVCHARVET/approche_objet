package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, int montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afficherOperation(int montant) {
		System.out.println(date + montant);
	}

	@Override
	public String toString() {
		return "Debit [date=" + date + ", montant=" + montant + "]";
	}

}
