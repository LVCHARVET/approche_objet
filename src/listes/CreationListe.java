package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> arrayCent = new ArrayList<>();
		for (int i=0 ; i<100; i++) {
			arrayCent.add(i);
		}
		
		System.out.println(arrayCent.size());

	}

}
