package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> arrayEntier = new ArrayList<>();
		arrayEntier.add(-1);
		arrayEntier.add(5);
		arrayEntier.add(7);
		arrayEntier.add(3);
		arrayEntier.add(-2);
		arrayEntier.add(4);
		arrayEntier.add(8);
		arrayEntier.add(5);
		int maxElem = 0;
		int minElem = 0;
		for (int entiers : arrayEntier) {
			System.out.println(entiers);
			if (entiers > maxElem) {
				maxElem = entiers;
			} else if (entiers < minElem) {
				minElem = entiers;
			}
		}
		System.out.println(arrayEntier.size());
		System.out.println(maxElem);
		System.out.println(minElem);
		Iterator<Integer> iter = arrayEntier.iterator();
		while (iter.hasNext()) {
			Integer entier = iter.next();
			if (entier.equals(minElem)) {
				iter.remove();
			}
		}
		System.out.println(arrayEntier.size());
		System.out.println("--------------------");
		for (int entiers : arrayEntier) {
			System.out.println(entiers);
		}
		System.out.println("--------------------");
		for (int i = 0; i < arrayEntier.size(); i++) {
			Integer element = arrayEntier.get(i);
			if (element < 0) {
				arrayEntier.set(i, Math.abs(element));
			}
		}
		System.out.println("--------------------");
		for (int entiers : arrayEntier) {
			System.out.println(entiers);
		}

	}

}
