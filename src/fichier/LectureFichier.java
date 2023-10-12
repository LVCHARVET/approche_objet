package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		ArrayList<Ville> arrayVille = new ArrayList<>();

		Path pathfile = Paths.get("C:/temp/recensement.csv");

		List<String> lines = Files.readAllLines(pathfile);
		String firstLine = null;
		for (int i = 0; i < lines.size(); i++) {
			String line = lines.get(i);
			String[] tokens = line.split(";");
			firstLine = lines.get(0);
			if (i > 1) {

				if (tokens.length == 10) {
					String transfoPop = tokens[9].replace(" ", "");
					String nom = tokens[6];
					String departement = tokens[2];
					String nomRegion = tokens[1];
					int popTotal = Integer.parseInt(transfoPop);

					Ville ville = new Ville(nom, departement, nomRegion, popTotal);
					arrayVille.add(ville);
				}
			}
		}
		System.out.println(firstLine);

		ArrayList<Ville> arrayVille25000 = new ArrayList<>();

		for (Ville villes : arrayVille) {
			if (villes.getPopTotal() >= 25000) {
				arrayVille25000.add(villes);
			}
		}

		Path pathNewFile = Paths.get("C:/temp/recensement_25000.csv");
		Files.createFile(pathNewFile);
		Files.write(pathNewFile, (firstLine + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);

		for (Ville ville : arrayVille25000) {
			String line = ville.getNom() + ";" + ville.getDepartement() + ";" + ville.getNomRegion() + ";"
					+ ville.getPopTotal();
			Files.write(pathNewFile, (line + System.lineSeparator()).getBytes(), StandardOpenOption.APPEND);
		}

	}

}
