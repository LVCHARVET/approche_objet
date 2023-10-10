package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
	private Piece[] arrayPiece;
	private int indexPiece;

	public Maison(int nbPiece) {
		this.arrayPiece = new Piece[nbPiece];
		this.indexPiece = 0;
	}

	public void ajouterPiece(Piece piece) {
		if (piece != null && piece.getSuperficie() >= 0 && piece.getEtage() >= 0) {
			if (indexPiece == arrayPiece.length) {
				int newArrayPiece = arrayPiece.length + 1;
				arrayPiece = Arrays.copyOf(arrayPiece, newArrayPiece);
			}
			arrayPiece[indexPiece] = piece;
			indexPiece++;
		}
	}

	public double calculSuperficie() {
		double superficieTotale = 0.0;
		for (Piece pieces : arrayPiece) {
			superficieTotale = superficieTotale + pieces.getSuperficie();
		}
		return superficieTotale;
	}

	public double calculSuperficieEtage(int etage) {
		double superficieEtage = 0.0;
		for (int i = 0; i < arrayPiece.length; i++) {
			if (arrayPiece[i].getEtage() == etage) {
				superficieEtage = superficieEtage + arrayPiece[i].getSuperficie();
			}
		}
		return superficieEtage;
	}

	public double superficieTypePiece(String typePiece) {
		double superficieType = 0;
		for (Piece pieces : arrayPiece) {
			if (pieces.getClass().getSimpleName().equals(typePiece)) {
				superficieType = superficieType + pieces.getSuperficie();
			}
		}
		return superficieType;
	}
	
	public int nombrePiece(String typePiece) {
		int nombrePiece = 0;
		for (Piece pieces : arrayPiece) {
			if (pieces.getClass().getSimpleName().equals(typePiece)) {
				nombrePiece++;
			}
		}
		return nombrePiece;
	}

}
