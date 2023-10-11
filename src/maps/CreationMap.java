package maps;

import java.util.HashMap;

public class CreationMap {

	public static void main(String[] args) {
		HashMap<Integer, Employe> mapEmploye = new HashMap<>();
		
		mapEmploye.put(111, new Employe("Paul", 1750));
		mapEmploye.put(222, new Employe("Hicham", 1825));
		mapEmploye.put(333, new Employe("Yu", 2250));
		mapEmploye.put(444, new Employe("Ingrid", 2015));
		mapEmploye.put(555, new Employe("Chantal", 2418));
		
		System.out.println(mapEmploye.size());
	}

}
