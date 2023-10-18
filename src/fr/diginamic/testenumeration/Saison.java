package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Primtemps", 1), ETE("Eté", 2), AUTOMNE("Autonme", 3), HIVER("Hiver", 4);

	private String libelle;
	private int ordre;

	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	public String getLibelle() {
		return libelle;
	}

	public int getOrdre() {
		return ordre;
	}

	public static Saison getSaisonByLibelle(String libelle) {
		for (Saison saison : values()) {
			if (saison.getLibelle().equalsIgnoreCase(libelle)) {
				return saison;
			}
		}
		return null;
	}

}
