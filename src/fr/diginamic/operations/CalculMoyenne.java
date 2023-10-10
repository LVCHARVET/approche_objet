package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
	private double[] arrayDouble;
	private int iArrayDouble;

	public CalculMoyenne() {
		this.arrayDouble = new double[10];
		this.iArrayDouble = 0;
	}

	public void addDouble(double Double) {
		if (iArrayDouble == arrayDouble.length) {
			int newArrayLenght = arrayDouble.length * 2;
			arrayDouble = Arrays.copyOf(arrayDouble, newArrayLenght);
		}
		arrayDouble[iArrayDouble] = Double;
		iArrayDouble++;
	}

	public double calculMoy() {
		double moy = 0;
		for (double arrayValue : arrayDouble) {
			moy = moy + arrayValue;
		}
		moy = moy / arrayDouble.length;
		return moy;
	}

	@Override
	public String toString() {
		return "CalculMoyenne [arrayDouble=" + Arrays.toString(arrayDouble) + ", iArrayDouble=" + iArrayDouble + "]";
	}

}
