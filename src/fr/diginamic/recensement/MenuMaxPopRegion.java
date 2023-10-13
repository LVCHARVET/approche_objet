package fr.diginamic.recensement;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MenuMaxPopRegion extends MenuService {

	public MenuMaxPopRegion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> arrayVille = recensement.getArrayVille();
		//String valueScanner = scanner.next();
		HashMap<String, Integer> comptageRegion = new HashMap<>();
		for (Ville villes : arrayVille) {
			String region = villes.getCodeRegion();
			if (comptageRegion.containsKey(region)) {
				comptageRegion.put(villes.getNomRegion(), comptageRegion.get(region) + villes.getPopTotale());				
			} else {
				comptageRegion.put(villes.getNomRegion(), villes.getPopTotale());
			}
		}
		
		List<Map.Entry<String, Integer>> sortedRegion = comptageRegion.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList());
		int limit = 10;
		for (int i = 0 ; i < Math.min(limit, sortedRegion.size()); i++) {
			Map.Entry<String, Integer> entry = sortedRegion.get(i);
            String region = entry.getKey();
            int population = entry.getValue();
            System.out.println(region + ": " + population + " habitants");
		}
		
		//System.out.println(comptageRegion);
	}

}
