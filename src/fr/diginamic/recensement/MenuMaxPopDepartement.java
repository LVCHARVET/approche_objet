package fr.diginamic.recensement;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MenuMaxPopDepartement extends MenuService {

	public MenuMaxPopDepartement() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> arrayVille = recensement.getArrayVille();
		//String valueScanner = scanner.next();
		HashMap<String, Integer> comptageDepartement = new HashMap<>();
		for (Ville villes : arrayVille) {
			String departement = villes.getCodeDepartement();
			if (comptageDepartement.containsKey(departement)) {
				comptageDepartement.put(departement, comptageDepartement.get(departement) + villes.getPopTotale());				
			} else {
				comptageDepartement.put(departement, villes.getPopTotale());
			}
		}
		
		List<Map.Entry<String, Integer>> sortedDepartement = comptageDepartement.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList());
		int limit = 10;
		for (int i = 0 ; i < Math.min(limit, sortedDepartement.size()); i++) {
			Map.Entry<String, Integer> entry = sortedDepartement.get(i);
            String departement = entry.getKey();
            int population = entry.getValue();
            System.out.println(departement + ": " + population + " habitants");
		}
	}

}
