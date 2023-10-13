package fr.diginamic.recensement;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MenuMaxPopVilleRegion extends MenuService {

	public MenuMaxPopVilleRegion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> arrayVille = recensement.getArrayVille();
		String valueScanner = scanner.next();
		HashMap<String, Integer> comptageVilleRegion = new HashMap<>();
		for (Ville villes : arrayVille) {
			String region = villes.getCodeRegion();
			if (valueScanner.equals(region)) {
				comptageVilleRegion.put(villes.getNomCommune(), villes.getPopTotale());
			}
		}
		List<Map.Entry<String, Integer>> sortedVilles = comptageVilleRegion.entrySet()
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
