package hoofdstuk12.eindopdracht;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpstartKlasse {

	public static void main(String[] args) {
		//Ricks stukje
		Scanner userInput = new Scanner(System.in); //Userinput opvangen met een scanner.
		System.out.println("Geef een diameter van een circle om de omtrek & oppervlak te bereken");
		try {

			double dia = userInput.nextDouble(); //opvangen user input.
			
			System.out.println(dia + "×" + Waardes.PI + "= " + Waardes.berekenOmtrek(dia));
			System.out.println(dia + "/2 " + "^2×" + Waardes.PI + "= " + Waardes.berekenOppervlak(dia));

		} catch (InputMismatchException e) { //zorgt ervoor dat het programma restart bij een ongeldige nummer invoer.
			
			System.out.println("Ongeldige input probeer opnieuw.....");
			main(null); //herstart het programma zonder arguments.
		}
		
		//Jelles stukje
		System.out.println();
		//Roept de methode op uit de waardes classe genaamt piramide.
		Waardes.piramide();
		
		userInput.close(); //sluiten scanner i.v.m. resource leaks.
	}

}
