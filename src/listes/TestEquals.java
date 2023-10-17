package listes;

public class TestEquals {

	public static void main(String[] args) {
		Ville ville1 = new Ville("Chartres", 44000);
		Ville ville2 = new Ville("Chartres", 44000);
		
		boolean result = ville1.equals(ville2);
		
		System.out.println(result);
		
		
		System.out.println(ville1.hashCode());
		System.out.println(ville2.hashCode());
		
		if (ville1.hashCode() == ville2.hashCode()) {
			System.out.println(result);
		}

	}

}
