package hoofdstuk12.eindopdracht;

import java.math.BigDecimal; //BigDecimal is een non primitive type voor grote decimalen.
import java.util.Scanner;

public final class Waardes{

	// (Wiskundige) Waardes Rick
	public static final double PI = 3.142857142857143;

	// methods Rick

	// Method om de omtrek van een cirkel te bereken.
	public static BigDecimal berekenOmtrek(double diameterFromUser) {

		BigDecimal diameter = BigDecimal.valueOf(diameterFromUser);
		BigDecimal BigPI = BigDecimal.valueOf(Waardes.PI);
		BigDecimal output = diameter.multiply(BigPI);

		return output;
	}

	// Method om de oppervlak van een cirkel op te vangen
	public static BigDecimal berekenOppervlak(double diameter) {
		BigDecimal dia = BigDecimal.valueOf(diameter);
		BigDecimal BigPI = BigDecimal.valueOf(Waardes.PI);
		BigDecimal straal = dia.divide(BigDecimal.valueOf(2));
		BigDecimal surface = straal.pow(2).multiply(BigPI);

		return surface;
	}
	
	//Jelles stukje
	
	public static void piramide () {
		//Scanner aanmaken en variabele counter.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nu gaan we een piramide bouwen, Hoe hoog moet ie worden?");
		int input = scanner.nextInt();
		int counter = 0;

		//Dubbele forloop, de eerste is voor een enter en de counter voor de latere while-loop op 0 zetten.
        for(int i = 1; i <= input; i++, counter = 0) {
        	//De tweede forloop is voor het plaatsen van spaties.
            for(int space = 1; space <= input - i; ++space) {
                System.out.print(" ");
            }
            //Deze while loop plaatst het ^ teken en doet dit door twee keer i te nemen min 1 en em dan te plaatsen.
            while(counter != 2 * i - 1) {
                System.out.print("^");
                counter++;
            }
            //De enter van de eerste forloop.
            System.out.println();
        }
	}
}
