package hoofdstuk13.EigenOpdracht;

import java.util.Scanner;

public class MainKlasse extends AbstrKlasse{
	
	public static void main(String[] args) {
		AbstrKlasse ab = new AbstrKlasse();
		System.out.println("Holle bolle gijs eet 20 hamburgers dat is 10 kilo totaal.");
		System.out.println(ab.getDikteKilo() + " Kilo weegt hij nu maar na het eten weegt hij: " + ab.addDikteKilo(10) + " Kilo");
		System.out.println("Dan gaat hij sporten en rent 20 kilometer en verliest hierdoor 5 kilo totaal.");
		System.out.println(ab.getDikteKilo() + " Kilo weegt hij nu maar na het sporten weegt hij: " + ab.removeDikteKilo(5) + " Kilo");
		
		//begin Rick zijn code 1.
		ab.customEten();
	}
}
