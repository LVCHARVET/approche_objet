package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path pathfile = Paths.get("C:/temp/recensement.csv");
		Path pathCible = Paths.get("C:/temp/recensement_100.csv");
		List<String> newFile = new ArrayList<>();
		List<String> lines = Files.readAllLines(pathfile, StandardCharsets.UTF_8);
		int i = 0;
		for (String l : lines) {
			if (i < 100) {
				i++;
				System.out.println(l);
				newFile.add(l);
			}
		}
		Files.write(pathCible, newFile, StandardOpenOption.APPEND);

	}

}
