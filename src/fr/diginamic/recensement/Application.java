package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws IOException {
		ArrayList<Ville> arrayVille = new ArrayList<>();

		Path pathfile = Paths.get("C:/temp/TP16/TP16_recensement.csv");

		List<String> lines = Files.readAllLines(pathfile);

		String firstLine = null;

		for (int i = 0; i < lines.size(); i++) {

			String line = lines.get(i);
			String[] tokens = line.split(";");

			firstLine = lines.get(0);

			if (i > 1) {

				if (tokens.length == 10) {

					String codeRegion = tokens[0];
					String nomRegion = tokens[1];
					String codeDepartement = tokens[2];
					String codeCommune = tokens[5];
					String nomCommune = tokens[6];
					String transfoPop = tokens[9].replace(" ", "");
					int popTotal = Integer.parseInt(transfoPop);

					Ville ville = new Ville(codeRegion, nomRegion, codeDepartement, codeCommune, nomCommune, popTotal);
					arrayVille.add(ville);
				}
			}
		}

		Recensement recensementVille = new Recensement(arrayVille);

		Scanner scanner = new Scanner(System.in);
		int choix = 0;

		while (choix != 9) {
			System.out.println("Menu :");
			System.out.println("1. Population d'une ville donnée");
			System.out.println("2. Population d'un département donné");
			System.out.println("3. Population d'une région donnée");
			System.out.println("4. Afficher les 10 régions les plus peuplées");
			System.out.println("5. Afficher les 10 départements les plus peuplés");
			System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
			System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
			System.out.println("8. Afficher les 10 villes les plus peuplées de France");
			System.out.println("9. Sortir");
			System.out.print("Veuillez choisir une option : ");
			choix = scanner.nextInt();

			switch (choix) {
			case 1:
				Scanner scannerUniqueVille = new Scanner(System.in);
				System.out.println("1. Population d'une ville donnée");
				System.out.print("Nom de ville : ");
				MenuService rechercheVille = new MenuUniqueVille();
				rechercheVille.traiter(recensementVille, scannerUniqueVille);
				break;
			case 2:
				Scanner scannerUniqueDepartement = new Scanner(System.in);
				System.out.println("2. Population d'un département donné");
				System.out.print("Numéro de département : ");
				MenuService rechercheDepartement = new MenuPopDepartement();
				rechercheDepartement.traiter(recensementVille, scannerUniqueDepartement);
				break;
			case 3:
				Scanner scannerUniqueRegion = new Scanner(System.in);
				System.out.println("3. Population d'une région donnée");
				System.out.print("Numéro de région : ");
				MenuService rechercheRegion = new MenuPopRegion();
				rechercheRegion.traiter(recensementVille, scannerUniqueRegion);
				break;
			case 4:
				Scanner scannerMaxPopRegion = new Scanner(System.in);
				System.out.println("4. Afficher les 10 régions les plus peuplées");
				System.out.print("Appuyer sur n'importe quel chiffre : ");
				MenuService rechercheMaxPopRegion = new MenuMaxPopRegion();
				rechercheMaxPopRegion.traiter(recensementVille, scannerMaxPopRegion);
				break;
			case 5:
				Scanner scannerMaxPopDepartement = new Scanner(System.in);
				System.out.println("5. Afficher les 10 départements les plus peuplés");
				System.out.print("Appuyer sur n'importe quel chiffre : ");
				MenuService rechercheMaxPopDepartement = new MenuMaxPopDepartement();
				rechercheMaxPopDepartement.traiter(recensementVille, scannerMaxPopDepartement);
				break;
			case 6:
				Scanner scannerMaxPopVilleDepartement = new Scanner(System.in);
				System.out.println("6. Afficher les 10 villes les plus peuplées d'un département");
				System.out.print("Numéro de département : ");
				MenuService rechercheMaxPopVilleDepartement = new MenuMaxPopVilleDepartement();
				rechercheMaxPopVilleDepartement.traiter(recensementVille, scannerMaxPopVilleDepartement);
				break;
			case 7:
				Scanner scannerMaxPopVilleRegion = new Scanner(System.in);
				System.out.println("7. Afficher les 10 villes les plus peuplées d'une région");
				System.out.print("Numéro de région : ");
				MenuService rechercheMaxPopVilleRegion = new MenuMaxPopVilleRegion();
				rechercheMaxPopVilleRegion.traiter(recensementVille, scannerMaxPopVilleRegion);
				break;
			case 8:
				Scanner scannerMaxPopVille = new Scanner(System.in);
				System.out.println("8. Afficher les 10 villes les plus peuplées de France");
				System.out.print("Appuyer sur n'importe quel chiffre : ");
				MenuService rechercheMaxPopVille = new MenuMaxPopVille();
				rechercheMaxPopVille.traiter(recensementVille, scannerMaxPopVille);
				break;
			case 9:
				System.out.println("Au revoir !");
				break;
			default:
				System.out.println("Choix invalide. Veuillez réessayer.");
				break;
			}
		}
		scanner.close();

	}
}
