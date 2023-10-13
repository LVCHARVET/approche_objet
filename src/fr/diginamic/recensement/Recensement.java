package fr.diginamic.recensement;

import java.util.List;

public class Recensement {
	List<Ville> arrayVille;

	public Recensement(List<Ville> arrayVille) {
		super();
		this.arrayVille = arrayVille;
	}

	@Override
	public String toString() {
		return "Recensement [arrayVille=" + arrayVille + "]";
	}

	public List<Ville> getArrayVille() {
		return arrayVille;
	}

	public void setArrayVille(List<Ville> arrayVille) {
		this.arrayVille = arrayVille;
	}

}
