package fr.diginamic.recensement;

import java.util.List;
import java.util.Scanner;

public class MenuUniqueVille extends MenuService {

	public MenuUniqueVille() {
	}

	@Override
	public void traiter(Recensement recensement, Scanner scanner) {
		List<Ville> arrayVille = recensement.getArrayVille();
		String valueScanner = scanner.next();
		for (Ville villes : arrayVille) {
			if (valueScanner.equals(villes.getNomCommune())) {
				System.out.println(villes.getPopTotale());
			}
		}
	}

}
