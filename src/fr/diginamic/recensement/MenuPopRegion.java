package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MenuPopRegion extends MenuService {

	public MenuPopRegion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> arrayVille = recensement.getArrayVille();
		String valueScanner = scanner.next();
		HashMap<String, Integer> comptageDepartement = new HashMap<>();
		Long popDepartement = 0L;
		for (Ville villes : arrayVille) {
			String departement = villes.getCodeDepartement();
			if (comptageDepartement.containsKey(departement) && valueScanner.equals(villes.getCodeDepartement())) {
				comptageDepartement.put(departement, comptageDepartement.get(departement) + 1);
				popDepartement = popDepartement + villes.getPopTotale();
			} else {
				comptageDepartement.put(departement, 1);
			}
		}
		System.out.println(popDepartement);
	}

}
