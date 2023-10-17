package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		long startTimeString = System.currentTimeMillis();
		String nbString = null;
		
		for (int i = 1; i <= 100000; i++) {
			nbString = nbString + i;
		}
		long endTimeString = System.currentTimeMillis();
		long executionTimeString = endTimeString - startTimeString;
		
		System.out.println("Temps écoulé avec concat : " + executionTimeString + " millisecondes");

		System.out.println("---------------");

		long startTimeAppend = System.currentTimeMillis();
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 1; i <= 100000; i++) {
			stringBuilder.append(i);
		}

		long endTimeAppend = System.currentTimeMillis();
		long executionTimeAppend = endTimeAppend - startTimeAppend;
		
		System.out.println("Temps écoulé avec append : " + executionTimeAppend + " millisecondes");
		
	}

}
