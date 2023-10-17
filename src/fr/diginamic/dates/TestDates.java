package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TestDates {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SimpleDateFormat heureActuel = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.FRANCE);
		System.out.println(heureActuel.format(new Date()));
		
		SimpleDateFormat formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date date = new Date(119, 4, 19, 23, 59, 30);
		
		
		String dateFixe = formateur.format(date);
		System.out.println(dateFixe);
		
		
		
		
	}

}
