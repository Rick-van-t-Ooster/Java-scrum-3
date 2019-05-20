package hoofdstuk12.boekOpdracht;

public class HoofdKlasse {

	public static void main(String[] args) {
		
		//Math m = new Math(); er is geen Constructor voor de Math class.
		Math m; // Je kunt de Math class op deze manier gebruiken.
		
		System.out.println(Math.PI); //Conclusie je kunt Math gebruiken zonder een object te gebruiken
		
		//Je kunt de method max() gebruiken om de grootste getal terug te krijgen.
		System.out.println(Math.max(35, 46));
		
		//Om het kleinste getal van de 2 gegeven getallen te vinden gebruik je method min()
		System.out.println(Math.min(46.98, 44.99));
		
		//De wortel van 81 berekenen met de method sqrt (square root / vierkantswortel)
		System.out.println(Math.sqrt(81.0));
		
	}
	
}
