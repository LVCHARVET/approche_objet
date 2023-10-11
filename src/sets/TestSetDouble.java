package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {
		HashSet<Double> arrayDouble = new HashSet<>();

		arrayDouble.add(1.5);
		arrayDouble.add(8.25);
		arrayDouble.add(-7.32);
		arrayDouble.add(13.3);
		arrayDouble.add(-12.45);
		arrayDouble.add(48.5);
		arrayDouble.add(0.01);

		Iterator<Double> iter = arrayDouble.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        
        double maxValue = Double.MIN_VALUE;
        for (double doubles : arrayDouble) {
            if (doubles > maxValue) {
                maxValue = doubles;
            }
        }
        
        double minValue = Double.MAX_VALUE;
        for (double doubles : arrayDouble) {
            if (doubles < minValue) {
                minValue = doubles;
            }
        }
        arrayDouble.remove(minValue);
        
       System.out.println("---------------");
       
       for (double doubles : arrayDouble) {
    	   System.out.println(doubles);
       }
	}
}
