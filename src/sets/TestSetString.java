package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		HashSet<String> arrayPays = new HashSet<>();
		arrayPays.add("USA");
		arrayPays.add("France");
		arrayPays.add("Allemagne");
		arrayPays.add("UK");
		arrayPays.add("Italie");
		arrayPays.add("Japon");
		arrayPays.add("Chine");
		arrayPays.add("Russie");
		arrayPays.add("Inde");
		
		String maxLettrePays = "";
        int maxNombreLettre = 0;
        for (String pays : arrayPays) {
            if (pays.length() > maxNombreLettre) {
                maxNombreLettre = pays.length();
                maxLettrePays = pays;
            }
        }
        
        arrayPays.remove(maxLettrePays);
        
        for (String pays : arrayPays) {
        	System.out.println(pays);
        }
		
	}

}
