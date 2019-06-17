package hoofdstuk11.eigenOpdracht;


import java.util.*;

public class Subklasse extends Superklasse {
	protected static int aantalLiterBenzine = 30;
	Subklasse(int aantalLiterBenzine){
		super(30);
	}
	public static boolean bezig = false;
	//Deze methode door Jelle
	public static void rijden() {
		System.out.println("Deze auto rijdt 30 kilometer op 1 liter benzine, hij heeft 30 liter benzine.");
		System.out.println("Hoeveel kilometer wilt u rijden?");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input > 900) {
			System.out.println("Zo ver kan de auto niet rijden!");
			scanner.nextLine();
			rijden();
		}else {
			int kmEraf = input / 30;
			aantalLiterBenzine = aantalLiterBenzine - kmEraf;
			System.out.println("U heeft " + input + " kilometer gereden, daarom is er nu " + aantalLiterBenzine + " liter over.");
			bezig=true;
		}
	}
	//Method Rick
	public static void tanken() {
		System.out.println("Er is nog " + aantalLiterBenzine + " Benzine over kies hoeveel je liters je wilt tanken");
		Scanner input = new Scanner(System.in);
		try {
			int aantal = input.nextInt();
			/*
			 * Wanneer het ingevoerde groter is dan de
			 *   beschikbare plaats in de brandstof tank word er niet getankt.
			 * 
			 */
			
			if((30-aantalLiterBenzine) < aantal) {
				System.out.println("Dit gaat er niet allemaal in hoor.");
				input.nextLine();
				tanken();
				
			}else if(aantal >= 30){
				System.out.println("Dit gaat er niet allemaal in hoor.");
				input.nextLine();
				tanken();
			}else {
				aantalLiterBenzine+=aantal;
				System.out.println("Succesvol getankt");
				bezig=true;
			}
			
			
		}catch( InputMismatchException e) {
			System.out.println("Ongeldige input, probeer opnieuw");
			input.nextLine();
			tanken();
		}
		input.close();
	}
	//2de method door Rick.
	/*
	 * Method die het programma draaiend houd door te kijken naar user input.
	 */
	public static void run() {
		
		Scanner keuzeSC = new Scanner(System.in);
		System.out.println("Maak een keuze 1. rijden 2. tanken 3. bekijk hoeveel brandstof je nog heb 4. sluiten van het programma.");

		
			try {
			int keuze = keuzeSC.nextInt();
			//Voert de method die bij de user input hoort uit.
			switch (keuze) {
			case 1:
				rijden();
				break;
			case 2:
				tanken();
				break;
			case 3:
				System.out.println("work in progress");
				break;
			case 4:
				System.exit(0);
				break;
			default:
				break;
			}}catch(InputMismatchException e) {
				System.out.println("Ongeldige input...");
				keuzeSC.nextLine();
			}
	
		run(); //wannneer de method van de gebruikers keuze klaar is met uitvoeren word deze method opnieuw aangeroepen.
	}
	
	
	public static void main(String[] args) {
		run();
		
	
	}
	}
