package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Operation[] arrayOpe;

		arrayOpe = new Operation[4];
		arrayOpe[0] = new Credit("09/10/2023", 500);
		arrayOpe[1] = new Credit("09/10/2023", 5000);
		arrayOpe[2] = new Debit("09/10/2023", -500);
		arrayOpe[3] = new Debit("09/10/2023", -5000);

		for (Operation operations : arrayOpe) {
			System.out.println(operations);
		}
	}

}
