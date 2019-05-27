package hoofdstuk12.eindopdracht;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpstartKlasse {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in); //Userinput opvangen met een scanner.
		System.out.println("Geef een diameter van een circle om de omtrek & oppervlak te bereken");
		try {

			double dia = userInput.nextDouble();
			System.out.println(Waardes.PI);
			System.out.println(dia + "×" + Waardes.PI + "= " + Waardes.berekenOmtrek(dia));
			System.out.println(dia + "/2 " + "^2×" + Waardes.PI + "= " + Waardes.berekenOppervlak(dia));

		} catch (InputMismatchException e) {
			System.out.println("Ongeldige input probeer opnieuw.....");
			main(null);
		}

		userInput.close();
	}

}
