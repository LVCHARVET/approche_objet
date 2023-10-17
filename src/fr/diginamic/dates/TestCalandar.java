package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestCalandar {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2016, 4, 19, 23, 59, 30);

		System.out.println(cal.getTime());
		
		System.out.println("---------------");
		
		Calendar calActuel = Calendar.getInstance();		
		System.out.println(calActuel.getTime());
		
		SimpleDateFormat heureActuelFrance = new SimpleDateFormat("EEEE dd MMMM yyyy yyyy/MM/dd HH:mm:ss", Locale.FRANCE);
		System.out.println(heureActuelFrance.format(calActuel.getTime()));
		
		SimpleDateFormat heureActuelAllemand = new SimpleDateFormat("EEEE dd MMMM yyyy yyyy/MM/dd HH:mm:ss", Locale.GERMAN);
		System.out.println(heureActuelAllemand.format(calActuel.getTime()));
		
		SimpleDateFormat heureActuelChine = new SimpleDateFormat("EEEE dd MMMM yyyy yyyy/MM/dd HH:mm:ss", Locale.CHINA);
		System.out.println(heureActuelChine.format(calActuel.getTime()));
		
		SimpleDateFormat heureActuelRusse = new SimpleDateFormat("EEEE dd MMMM yyyy yyyy/MM/dd HH:mm:ss", new Locale("ru", "RU"));
		System.out.println(heureActuelRusse.format(calActuel.getTime()));
		
	}

}
