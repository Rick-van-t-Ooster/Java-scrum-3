package hoofdstuk12.eindopdracht;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpstartKlasse {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Geef een diameter van een circle om de omtrek te bereken");
		try {
			
			double dia = userInput.nextDouble();
			System.out.println(dia);
			System.out.println(
					userInput.nextDouble() + " * " + Waardes.PI + " = " + Waardes.berekenOmtrek(dia));

		} catch (InputMismatchException e) {
			System.out.println("ONGELDIGE INPUT REEEEEEEEEEEEEEEEEEE");
			main(null);
		}

		userInput.close();
	}

	
	}
