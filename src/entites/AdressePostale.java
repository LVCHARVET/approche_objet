package entites;

public class AdressePostale {

	int numeroRUE;
	String libelleRue;
	int codePostal;
	String ville;

	AdressePostale(int nRUE, String libRue, int codPost, String town) {
		numeroRUE = nRUE;
		libelleRue = libRue;
		codePostal = codPost;
		ville = town;
	}

	@Override
	public String toString() {
		return "AdressePostale [numeroRUE=" + numeroRUE + ", libelleRue=" + libelleRue + ", codePostal=" + codePostal
				+ ", ville=" + ville + "]";
	}

}
