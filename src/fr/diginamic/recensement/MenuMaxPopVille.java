package fr.diginamic.recensement;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MenuMaxPopVille extends MenuService {

	public MenuMaxPopVille() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> arrayVille = recensement.getArrayVille();
		//String valueScanner = scanner.next();
		HashMap<String, Integer> comptageVille = new HashMap<>();
		for (Ville villes : arrayVille) {			
			comptageVille.put(villes.getNomCommune(), villes.getPopTotale());			
		}
		List<Map.Entry<String, Integer>> sortedVilles = comptageVille.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList());
		int limit = 10;
		for (int i = 0 ; i < Math.min(limit, sortedVilles.size()); i++) {
			Map.Entry<String, Integer> entry = sortedVilles.get(i);
            String ville = entry.getKey();
            int population = entry.getValue();
            System.out.println(ville + ": " + population + " habitants");
		}

	}

}
