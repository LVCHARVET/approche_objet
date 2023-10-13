package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class MenuPopDepartement extends MenuService {

	public MenuPopDepartement() {
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> arrayVille = recensement.getArrayVille();
		String valueScanner = scanner.next();
		HashMap<String, Integer> comptageRegion = new HashMap<>();
		Long popRegion = 0L;
		for (Ville villes : arrayVille) {
			String region = villes.getCodeRegion();
			if (comptageRegion.containsKey(region) && valueScanner.equals(villes.getCodeRegion())) {
				comptageRegion.put(region, comptageRegion.get(region) + 1);
				popRegion = popRegion + villes.getPopTotale();
			} else {
				comptageRegion.put(region, 1);
			}
		}
		System.out.println(popRegion);
	}
}
